public class GetAllergyTest {

    private MockWebServer mockWebServer;
    private GetAllergy getAllergy;

    @Before
    public void setup() throws Exception {
        mockWebServer = new MockWebServer();
        mockWebServer.start();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(mockWebServer.url("/"))  // point the retrofit baseUrl to the mockWebServer
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        getAllergy = retrofit.create(GetAllergy.class);
    }

    @Test
    public void testGetAllergiesCallSuccess() throws Exception {
        // Create mock response
        String fileName = "api_response_success.json"; // your mock response file in the test resources
        String responseBody = Utils.getStringFromFile(this, fileName);

        mockWebServer.enqueue(new MockResponse().setBody(responseBody).setResponseCode(200));

        // Make the API call through Retrofit
        Call<ResponseAllergy> call = getAllergy.getAllergiesCall("puuid_value", "application/json", "Bearer token_value");
        Response<ResponseAllergy> response = call.execute();

        // Validate the response
        assertTrue(response.isSuccessful());
        assertEquals("success", response.body().getStatus());
        assertTrue(response.body().getData().getAllergies().contains("pollen"));
    }

    @After
    public void tearDown() throws Exception {
        mockWebServer.shutdown();
    }
}
