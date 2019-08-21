package com.vivy.app

import com.vivy.app.ui.search.SearchVm
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.koin.java.KoinJavaComponent


class SearchVmTest : BaseUnitTest() {

    @Test
    fun `search query is not valid`() {
        assertEquals(KoinJavaComponent.get(SearchVm::class.java)
                .isValidSearchString(""), false)
    }

    @Test
    fun `search query is valid`() {
        assert(KoinJavaComponent.get(SearchVm::class.java)
                .isValidSearchString("ff"))
    }



}