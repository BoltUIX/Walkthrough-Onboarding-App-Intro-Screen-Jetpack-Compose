package compose.material.theme


class OnBoardingItems(
    val image: Int,
    val title: Int,
    val desc: Int
) {
    companion object{
        fun getData(): List<OnBoardingItems>{
            return listOf(
                OnBoardingItems(R.drawable.intro1, R.string.onBoardingTitle1, R.string.onBoardingText1),
                OnBoardingItems(R.drawable.intro2, R.string.onBoardingTitle2, R.string.onBoardingText2),
                OnBoardingItems(R.drawable.intro3, R.string.onBoardingTitle3, R.string.onBoardingText3)
            )
        }
    }
}
