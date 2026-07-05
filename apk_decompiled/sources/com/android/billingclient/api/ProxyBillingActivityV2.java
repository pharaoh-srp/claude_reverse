package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import defpackage.ad;
import defpackage.ba4;
import defpackage.jyj;
import defpackage.qc;
import defpackage.u79;
import defpackage.vc;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivityV2 extends ba4 {
    public ad Z;
    public ad a0;
    public ad b0;
    public ad c0;
    public ResultReceiver d0;
    public ResultReceiver e0;
    public ResultReceiver f0;
    public ResultReceiver g0;

    @Override // defpackage.ba4, defpackage.aa4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 0;
        this.Z = n(new qc(this) { // from class: g6k
            public final /* synthetic */ ProxyBillingActivityV2 F;

            {
                this.F = this;
            }

            @Override // defpackage.qc
            public final void e(Object obj) {
                int i2 = i;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.F;
                pc pcVar = (pc) obj;
                switch (i2) {
                    case 0:
                        Intent intent = pcVar.F;
                        int i3 = jyj.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.d0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
                        }
                        int i4 = pcVar.E;
                        if (i4 != -1 || i3 != 0) {
                            jyj.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = pcVar.F;
                        int i5 = pcVar.E;
                        Bundle extras = intent2 != null ? intent2.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            jyj.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i5);
                        }
                        int i6 = jyj.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.f0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i6, extras);
                        } else {
                            jyj.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i6 != 0) {
                            jyj.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new vc(3));
        this.a0 = n(new qc(this) { // from class: m6k
            public final /* synthetic */ ProxyBillingActivityV2 F;

            {
                this.F = this;
            }

            @Override // defpackage.qc
            public final void e(Object obj) {
                int i2 = i;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.F;
                pc pcVar = (pc) obj;
                switch (i2) {
                    case 0:
                        Intent intent = pcVar.F;
                        int i3 = jyj.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.e0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
                        }
                        int i4 = pcVar.E;
                        if (i4 != -1 || i3 != 0) {
                            jyj.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = pcVar.F;
                        int i5 = pcVar.E;
                        Bundle extras = intent2 != null ? intent2.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            jyj.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i5);
                        }
                        int i6 = jyj.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.g0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i6, extras);
                        } else {
                            jyj.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i6 != 0) {
                            jyj.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new vc(3));
        final int i2 = 1;
        this.b0 = n(new qc(this) { // from class: g6k
            public final /* synthetic */ ProxyBillingActivityV2 F;

            {
                this.F = this;
            }

            @Override // defpackage.qc
            public final void e(Object obj) {
                int i22 = i2;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.F;
                pc pcVar = (pc) obj;
                switch (i22) {
                    case 0:
                        Intent intent = pcVar.F;
                        int i3 = jyj.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.d0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
                        }
                        int i4 = pcVar.E;
                        if (i4 != -1 || i3 != 0) {
                            jyj.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = pcVar.F;
                        int i5 = pcVar.E;
                        Bundle extras = intent2 != null ? intent2.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            jyj.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i5);
                        }
                        int i6 = jyj.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.f0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i6, extras);
                        } else {
                            jyj.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i6 != 0) {
                            jyj.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new vc(3));
        this.c0 = n(new qc(this) { // from class: m6k
            public final /* synthetic */ ProxyBillingActivityV2 F;

            {
                this.F = this;
            }

            @Override // defpackage.qc
            public final void e(Object obj) {
                int i22 = i2;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.F;
                pc pcVar = (pc) obj;
                switch (i22) {
                    case 0:
                        Intent intent = pcVar.F;
                        int i3 = jyj.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.e0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
                        }
                        int i4 = pcVar.E;
                        if (i4 != -1 || i3 != 0) {
                            jyj.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = pcVar.F;
                        int i5 = pcVar.E;
                        Bundle extras = intent2 != null ? intent2.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            jyj.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i5);
                        }
                        int i6 = jyj.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.g0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i6, extras);
                        } else {
                            jyj.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i6 != 0) {
                            jyj.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new vc(3));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.d0 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.e0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f0 = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.g0 = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
                return;
            }
            return;
        }
        jyj.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.d0 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            ad adVar = this.Z;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            adVar.t(new u79(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.e0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            ad adVar2 = this.a0;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            adVar2.t(new u79(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f0 = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            ad adVar3 = this.b0;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            adVar3.t(new u79(intentSender3, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.g0 = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            ad adVar4 = this.c0;
            pendingIntent4.getClass();
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            intentSender4.getClass();
            adVar4.t(new u79(intentSender4, null, 0, 0));
        }
    }

    @Override // defpackage.ba4, defpackage.aa4, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.d0;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.e0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f0;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.g0;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }
}
