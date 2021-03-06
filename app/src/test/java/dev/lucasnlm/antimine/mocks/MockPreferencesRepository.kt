package dev.lucasnlm.antimine.mocks

import dev.lucasnlm.antimine.common.level.models.Minefield
import dev.lucasnlm.antimine.core.control.ControlStyle
import dev.lucasnlm.antimine.core.preferences.IPreferencesRepository

class MockPreferencesRepository : IPreferencesRepository {
    private var customMinefield = Minefield(9, 9, 9)

    override fun hasCustomizations(): Boolean = true

    override fun reset() { }

    override fun customGameMode(): Minefield = customMinefield

    override fun updateCustomGameMode(minefield: Minefield) {
        customMinefield = minefield
    }

    override fun controlStyle(): ControlStyle = ControlStyle.Standard

    override fun useControlStyle(controlStyle: ControlStyle) { }

    override fun isFirstUse(): Boolean = false

    override fun completeFirstUse() { }

    override fun customLongPressTimeout(): Long = 400L

    override fun themeId(): Long = 1L

    override fun useTheme(themeId: Long) { }

    override fun updateStatsBase(statsBase: Int) { }

    override fun getStatsBase(): Int = 0

    override fun getUseCount(): Int = 10

    override fun incrementUseCount() { }

    override fun incrementProgressiveValue() { }

    override fun decrementProgressiveValue() { }

    override fun getProgressiveValue(): Int = 0

    override fun isRequestRatingEnabled(): Boolean = false

    override fun disableRequestRating() { }

    override fun setPremiumFeatures(status: Boolean, keepShowingSupportButton: Boolean?) { }

    override fun isPremiumEnabled(): Boolean = false

    override fun showSupport(): Boolean = true

    override fun useFlagAssistant(): Boolean = false

    override fun useHapticFeedback(): Boolean = true

    override fun areaSizeMultiplier(): Int = 50

    override fun useAnimations(): Boolean = false

    override fun useQuestionMark(): Boolean = false

    override fun isSoundEffectsEnabled(): Boolean = false
}
