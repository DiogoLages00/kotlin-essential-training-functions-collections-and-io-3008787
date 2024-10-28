import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito

class ViewModelTest {

    @Test
    fun `trackEvent() is called when submitClick is called`() {
        val analytics = Mockito.mock(AnalyticsClient::class.java)
        val viewModel = ViewModel(analytics)

        viewModel.submitClicked()

        // Is going to verify that the track method was called on our mock interface with any string value
        Mockito.verify(analytics).track(anyString())

    }

}