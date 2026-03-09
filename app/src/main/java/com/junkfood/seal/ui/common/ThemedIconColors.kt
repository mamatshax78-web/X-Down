package com.junkfood.seal.ui.common

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.junkfood.seal.ui.theme.applyOpacity

/**
 * Centralized themed icon color provider for the entire application.
 * Provides colorful, theme-aware icon tints that look professional
 * in both light and dark modes (including gradient dark theme).
 *
 * Usage:
 *   Icon(imageVector = ..., tint = ThemedIconColors.primary)
 *   Icon(imageVector = ..., tint = ThemedIconColors.secondary)
 */
object ThemedIconColors {

    /** Primary accent color — use for main action icons, navigation selected state, key CTAs */
    val primary: Color
        @Composable get() = MaterialTheme.colorScheme.primary

    /** Secondary accent color — use for secondary actions, complementary icons */
    val secondary: Color
        @Composable get() = MaterialTheme.colorScheme.secondary

    /** Tertiary accent color — use for highlights, decorative/accent icons */
    val tertiary: Color
        @Composable get() = MaterialTheme.colorScheme.tertiary

    /** On-surface variant — use for subtle/utility icons that should not draw attention */
    val subtle: Color
        @Composable get() = MaterialTheme.colorScheme.onSurfaceVariant

    /** Error color — use for error/warning state icons */
    val error: Color
        @Composable get() = MaterialTheme.colorScheme.error

    /** On primary container — use for icons inside primary-colored containers */
    val onPrimaryContainer: Color
        @Composable get() = MaterialTheme.colorScheme.onPrimaryContainer

    /** Primary with opacity for disabled state */
    @Composable
    fun primary(enabled: Boolean): Color = primary.applyOpacity(enabled)

    /** Secondary with opacity for disabled state */
    @Composable
    fun secondary(enabled: Boolean): Color = secondary.applyOpacity(enabled)

    /** Tertiary with opacity for disabled state */
    @Composable
    fun tertiary(enabled: Boolean): Color = tertiary.applyOpacity(enabled)
}
