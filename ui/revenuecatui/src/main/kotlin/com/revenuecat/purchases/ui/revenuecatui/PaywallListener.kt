package com.revenuecat.purchases.ui.revenuecatui

import com.revenuecat.purchases.CustomerInfo
import com.revenuecat.purchases.Package
import com.revenuecat.purchases.PurchasesError
import com.revenuecat.purchases.models.StoreTransaction

@ExperimentalPreviewRevenueCatUIPurchasesAPI
interface PaywallListener {
    fun onPurchaseStarted(rcPackage: Package) {}
    fun onPurchaseCompleted(customerInfo: CustomerInfo, storeTransaction: StoreTransaction) {}
    fun onPurchaseError(error: PurchasesError) {}
    fun onRestoreStarted() {}
    fun onRestoreCompleted(customerInfo: CustomerInfo) {}
    fun onRestoreError(error: PurchasesError) {}
}
