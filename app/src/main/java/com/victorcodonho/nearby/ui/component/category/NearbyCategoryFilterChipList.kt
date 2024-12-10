package com.victorcodonho.nearby.ui.component.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.victorcodonho.nearby.data.model.Category
import com.victorcodonho.nearby.data.model.mock.mockCategories

@Composable
fun NearbyCategoryFilterChipList(
    modifier: Modifier = Modifier,
    categories: List<Category>,
    onSelectedCategoryChange: (Category) -> Unit
) {
    var selectedCategoryId by remember { mutableStateOf(categories.firstOrNull()?.id.orEmpty()) }

    LaunchedEffect(key1 = selectedCategoryId) {
        val selectedCategoryOrNull = categories.find { it.id == selectedCategoryId }
        selectedCategoryOrNull?.let {
            onSelectedCategoryChange(it)
        }
    }

    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(items = categories, key = { it.id }) { category ->
            NearbyCategoryFilterChip(
                category = category,
                isSelect = category.id == selectedCategoryId,
                onClick = { isSelect ->
                    if (isSelect)
                        selectedCategoryId = category.id
                }
            )
        }
    }
}

@Preview
@Composable
private fun NearbyCategoryFilterChipListPreview() {
    NearbyCategoryFilterChipList(
        modifier = Modifier.fillMaxWidth(),
        categories = mockCategories,
        onSelectedCategoryChange = {}
    )
}