package defpackage;

import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestFailed;
import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestFailureReason;
import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestSuccess;
import com.anthropic.claude.analytics.events.NetworkingEvents$RequestFailed;
import com.anthropic.claude.analytics.events.NetworkingEvents$RequestFailureReason;
import com.anthropic.claude.analytics.events.NetworkingEvents$RequestSuccess;
import com.anthropic.claude.configs.MobileObservabilityConfig;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class mie implements f89 {
    public final qi3 E;
    public final mn5 F;
    public final kw9 G;
    public final dmi H;

    public mie(qi3 qi3Var, mn5 mn5Var, String str, kw9 kw9Var, dmi dmiVar) {
        this.E = qi3Var;
        this.F = mn5Var;
        this.G = kw9Var;
        this.H = dmiVar;
        bsg.T0(str, "/api/");
    }

    public final void a(String str, int i, String str2, long j, String str3, Boolean bool) {
        NetworkingEvents$RequestFailed networkingEvents$RequestFailed = new NetworkingEvents$RequestFailed(str, NetworkingEvents$RequestFailureReason.HTTP_ERROR, Integer.valueOf(i), (String) null, str2, Long.valueOf(j), 8, (mq5) null);
        KSerializer kSerializerSerializer = NetworkingEvents$RequestFailed.Companion.serializer();
        qi3 qi3Var = this.E;
        qi3Var.e(networkingEvents$RequestFailed, kSerializerSerializer);
        qi3Var.e(new CronetAnalyticsEvents$RequestFailed(str, CronetAnalyticsEvents$RequestFailureReason.HTTP_ERROR, Integer.valueOf(i), null, str2, Long.valueOf(j), str3, bool), CronetAnalyticsEvents$RequestFailed.Companion.serializer());
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) throws Exception {
        mn5 mn5Var;
        Boolean bool;
        String str;
        long j;
        String str2;
        int i;
        Double network_request_sample_rate;
        qi3 qi3Var = this.E;
        kie kieVar = v4eVar.e;
        String strA = s9e.a(kieVar);
        mn5 mn5Var2 = this.F;
        long jA = mn5Var2.a();
        MobileObservabilityConfig mobileObservabilityConfig = (MobileObservabilityConfig) ((rc8) this.G.getValue()).l(MobileObservabilityConfig.CONFIG_NAME, MobileObservabilityConfig.Companion.serializer());
        if (h1e.F.c() >= ((mobileObservabilityConfig == null || (network_request_sample_rate = mobileObservabilityConfig.getNetwork_request_sample_rate()) == null) ? 0.05d : network_request_sample_rate.doubleValue())) {
            return v4eVar.b(kieVar);
        }
        Boolean boolValueOf = this.H.G != null ? Boolean.valueOf(!r3.booleanValue()) : null;
        try {
            pqe pqeVarB = v4eVar.b(kieVar);
            long jA2 = mn5Var2.a() - jA;
            String str3 = pqeVarB.F.E;
            boolean z = pqeVarB.U;
            int i2 = pqeVarB.H;
            if (z) {
                qi3Var.e(new NetworkingEvents$RequestSuccess(strA, jA2, i2), NetworkingEvents$RequestSuccess.Companion.serializer());
                mn5Var = mn5Var2;
                try {
                    bool = boolValueOf;
                    try {
                        qi3Var.e(new CronetAnalyticsEvents$RequestSuccess(strA, jA2, i2, str3, boolValueOf), CronetAnalyticsEvents$RequestSuccess.Companion.serializer());
                        return pqeVarB;
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bool = boolValueOf;
                }
            } else {
                String str4 = pqeVarB.G;
                if (bsg.I0(str4)) {
                    str4 = null;
                    str = str3;
                    bool = boolValueOf;
                    j = jA2;
                    str2 = strA;
                    i = i2;
                } else {
                    j = jA2;
                    str2 = strA;
                    i = i2;
                    str = str3;
                    bool = boolValueOf;
                }
                try {
                    a(str2, i, str4, j, str, bool);
                    return pqeVarB;
                } catch (Exception e3) {
                    e = e3;
                    strA = str2;
                    mn5Var = mn5Var2;
                }
            }
        } catch (Exception e4) {
            e = e4;
            mn5Var = mn5Var2;
        }
        long jA3 = mn5Var.a() - jA;
        String simpleName = e.getClass().getSimpleName();
        boolean z2 = e instanceof SocketTimeoutException;
        NetworkingEvents$RequestFailureReason networkingEvents$RequestFailureReason = (z2 || (e instanceof UnknownHostException) || (e instanceof IOException)) ? NetworkingEvents$RequestFailureReason.NETWORK_EXCEPTION : NetworkingEvents$RequestFailureReason.CLIENT_EXCEPTION;
        CronetAnalyticsEvents$RequestFailureReason cronetAnalyticsEvents$RequestFailureReason = (z2 || (e instanceof UnknownHostException) || (e instanceof IOException)) ? CronetAnalyticsEvents$RequestFailureReason.NETWORK_EXCEPTION : CronetAnalyticsEvents$RequestFailureReason.CLIENT_EXCEPTION;
        qi3Var.e(new NetworkingEvents$RequestFailed(strA, networkingEvents$RequestFailureReason, (Integer) null, simpleName, e.getMessage(), Long.valueOf(jA3), 4, (mq5) null), NetworkingEvents$RequestFailed.Companion.serializer());
        qi3Var.e(new CronetAnalyticsEvents$RequestFailed(strA, cronetAnalyticsEvents$RequestFailureReason, null, simpleName, e.getMessage(), Long.valueOf(jA3), null, bool), CronetAnalyticsEvents$RequestFailed.Companion.serializer());
        throw e;
    }
}
