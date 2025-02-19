package com.flipperdevices.ifrmvp.core.ui.button.core

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.flipperdevices.core.ui.theme.FlipperThemeInternal
import com.flipperdevices.ifrmvp.core.ui.ext.asPainter
import com.flipperdevices.ifrmvp.core.ui.layout.core.sf
import com.flipperdevices.ifrmvp.model.buttondata.IconButtonData

@Composable
fun SquareIconButton(
    onClick: (ButtonClickEvent) -> Unit,
    painter: Painter,
    background: Color,
    iconTint: Color,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
) {
    SquareButton(
        modifier = modifier,
        onClick = onClick,
        background = background,
    ) {
        Icon(
            painter = painter,
            contentDescription = contentDescription,
            tint = iconTint,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.sf)
        )
    }
}

@Composable
fun SquareImageButton(
    onClick: (ButtonClickEvent) -> Unit,
    bitmap: ImageBitmap,
    background: Color,
    iconTint: Color,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
) {
    SquareButton(
        modifier = modifier,
        onClick = onClick,
        background = background,
    ) {
        Icon(
            bitmap = bitmap,
            contentDescription = contentDescription,
            tint = iconTint,
            modifier = Modifier
                .fillMaxSize()
                .padding(12.sf)
        )
    }
}

@Composable
fun SquareIconButton(
    iconType: IconButtonData.IconType,
    modifier: Modifier = Modifier,
    iconTint: Color = Color.White,
    background: Color = buttonBackgroundColor,
    contentDescription: String? = null,
    onClick: (ButtonClickEvent) -> Unit,
) {
    SquareButton(
        modifier = modifier,
        onClick = onClick,
        background = background
    ) {
        Icon(
            painter = iconType.asPainter(),
            contentDescription = contentDescription,
            tint = iconTint,
            modifier = Modifier
                .fillMaxSize()
                .padding(12.sf)
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SquareIconButtonPreview() {
    FlipperThemeInternal {
        SquareIconButton(
            iconType = IconButtonData.IconType.POWER,
            onClick = {},
        )
    }
}
