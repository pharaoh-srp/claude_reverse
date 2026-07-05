package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.a3k;
import defpackage.gp1;
import defpackage.hp1;
import defpackage.isk;
import defpackage.jyj;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver E;
    public boolean F;
    public boolean G;
    public int H;
    public long I;
    public boolean J;

    public static int a(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 139 : 1;
        }
        if (i == -1) {
            return 113;
        }
        if (i == 0) {
            return 114;
        }
        if (i != 3) {
            return i != 4 ? 117 : 116;
        }
        return 115;
    }

    public final Intent b(int i, long j) {
        Intent intentC = c();
        intentC.putExtra("RESPONSE_CODE", 6);
        intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        gp1 gp1VarA = hp1.a();
        gp1VarA.E = 6;
        gp1VarA.G = "An internal error occurred.";
        hp1 hp1VarB = gp1VarA.b();
        int i2 = a3k.a;
        intentC.putExtra("FAILURE_LOGGING_PAYLOAD", a3k.b(i, 2, hp1VarB, null, isk.BROADCAST_ACTION_UNSPECIFIED).b());
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j);
        intentC.putExtra("wasServiceAutoReconnected", this.J);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            jyj.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.F = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.E = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.G = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.H = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.I = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.J = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        jyj.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.H = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.G = true;
                this.H = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.E = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.H = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.I = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.J = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.F = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.H, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            jyj.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.E;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentB = b(137, this.I);
                if (this.G) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
            this.F = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.F) {
            Intent intentC = c();
            intentC.putExtra("RESPONSE_CODE", 1);
            intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.G) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.H;
            if (i == 110 || i == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.I);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.E;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.F);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.G);
        bundle.putInt("activity_code", this.H);
        bundle.putLong("billingClientTransactionId", this.I);
        bundle.putBoolean("wasServiceAutoReconnected", this.J);
    }
}
