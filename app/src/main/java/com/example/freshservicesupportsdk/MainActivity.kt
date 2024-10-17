package com.example.freshservicesupportsdk

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.freshworks.sdk.freshservicesupportsdk.FSSupport


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun home(view: View) {
        FSSupport.showDashboard(
            activity = this@MainActivity,
            modules = listOf(
                FSSupport.Module.TICKETS,
                FSSupport.Module.REPORT_ISSUE,
                FSSupport.Module.REQUEST_SERVICE,
                FSSupport.Module.APPROVAL_REQUESTS,
            )
        )
    }

    fun ticketList(view: View) {
        FSSupport.showTicketList(activity = this@MainActivity)
    }

    fun reportIncident(view: View) {
        FSSupport.reportIssue(activity = this@MainActivity)
    }

    fun requestService(view: View) {
        FSSupport.requestService(activity = this@MainActivity)
    }

    fun approvalList(view: View) {
        FSSupport.showApprovalRequests(activity = this@MainActivity)
    }

    fun logout(view: View) {
        FSSupport.deInitialize(activity = this@MainActivity)
    }
}

