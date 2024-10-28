

class ViewModel(private val analyticsClient: AnalyticsClient) {

    fun submitClicked() {
        // if commented Test fails!!!
        analyticsClient.track("Submit Clicked")
    }

}
