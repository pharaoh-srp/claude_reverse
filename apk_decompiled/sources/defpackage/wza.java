package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.configs.flags.SseConfig;
import com.anthropic.claude.mcpapps.b;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import io.sentry.okhttp.h;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wza implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ wza(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws MissingAndroidContextException {
        long jR;
        switch (this.E) {
            case 0:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                ul0 ul0Var = new ul0(m7fVar, 4);
                kce kceVar = jce.a;
                ze0 ze0Var = (ze0) m7fVar.a(kceVar.b(ze0.class), null, null);
                String strM1071unboximpl = ((OrganizationId) m7fVar.a(kceVar.b(OrganizationId.class), null, null)).m1071unboximpl();
                String strM949unboximpl = ((AccountId) m7fVar.a(kceVar.b(AccountId.class), null, null)).m949unboximpl();
                bg9 bg9Var = (bg9) m7fVar.a(kceVar.b(bg9.class), null, null);
                return new b(ul0Var, ze0Var, strM1071unboximpl, strM949unboximpl, bg9Var, (mk7) m7fVar.a(kceVar.b(mk7.class), null, null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
            case 1:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                return new xza(m7fVar2);
            case 2:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                el5 el5Var = new el5(16);
                kce kceVar2 = jce.a;
                el5Var.E = (hdc) m7fVar3.a(kceVar2.b(hdc.class), null, null);
                el5Var.q((String) m7fVar3.a(kceVar2.b(String.class), nai.t, null));
                ((ArrayList) el5Var.H).add((w82) m7fVar3.a(kceVar2.b(qf0.class), null, null));
                bg9 bg9Var2 = (bg9) m7fVar3.a(kceVar2.b(bg9.class), null, null);
                ide ideVar = p8b.e;
                ((ArrayList) el5Var.G).add(new ee7(nai.D("application/json"), new efe(24, bg9Var2)));
                return el5Var.r();
            case 3:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                return kgh.o(((ze0) m7fVar4.a(jce.a.b(ze0.class), null, null)).a(), "/v1/mobile/");
            case 4:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                kce kceVar3 = jce.a;
                return new gob(((doi) m7fVar5.a(kceVar3.b(doi.class), null, null)).a("model_preferences"), (mn5) m7fVar5.a(kceVar3.b(mn5.class), null, null), (bg9) m7fVar5.a(kceVar3.b(bg9.class), null, null));
            case 5:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                return new f1c(yb5.g(m7fVar6));
            case 6:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                throw new IllegalStateException("OkHttpClient is unconstructable under Paparazzi/layoutlib (Platform.get() → conscrypt CNFE). Stub the consumer in its module's previewOverride.");
            case 7:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                throw new IllegalStateException("OkHttpClient is unconstructable under Paparazzi/layoutlib (Platform.get() → conscrypt CNFE). Stub the consumer in its module's previewOverride.");
            case 8:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return i25.a;
            case 9:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new r17() { // from class: a2c
                    @Override // defpackage.r17
                    public final m4e a(kie kieVar, gb9 gb9Var) {
                        throw new IllegalStateException("preview EventSource — no SSE");
                    }
                };
            case 10:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                return ((fk0) m7fVar7.a(jce.a.b(fk0.class), null, null)).b();
            case 11:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                mrb mrbVar = new mrb();
                hfj hfjVar = new hfj();
                int i = mrbVar.b;
                mrbVar.b = i + 1;
                mrbVar.a.add(i, hfjVar);
                return new prb(mrbVar);
            case 12:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar = b2c.a;
                mrg mrgVar2 = nai.h;
                kce kceVar4 = jce.a;
                return b2c.a((hdc) m7fVar8.a(kceVar4.b(hdc.class), mrgVar2, null), (String) m7fVar8.a(kceVar4.b(String.class), nai.k, null), (bg9) m7fVar8.a(kceVar4.b(bg9.class), null, null), new qf0((cj3) m7fVar8.a(kceVar4.b(cj3.class), null, null), null));
            case 13:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                return kgh.o(((ze0) m7fVar9.a(jce.a.b(ze0.class), null, null)).a(), "/api/");
            case 14:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                return kgh.o(((ze0) m7fVar10.a(jce.a.b(ze0.class), null, null)).a(), "/settings/billing");
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                String str = (String) m7fVar11.a(jce.a.b(String.class), nai.k, null);
                if (!isg.q0(str, "http://", false)) {
                    return d7j.a(str);
                }
                sz6.p("Must use secure URLs in production builds");
                return null;
            case 16:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                return ((ze0) m7fVar12.a(jce.a.b(ze0.class), null, null)) instanceof xe0 ? "https://www.claudeusercontent.com" : "https://staging.claudeusercontent.com";
            case g.MAX_FIELD_NUMBER /* 17 */:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                ze0 ze0Var2 = (ze0) m7fVar13.a(jce.a.b(ze0.class), null, null);
                if (ze0Var2 instanceof xe0) {
                    return "https://sandbox.claudemcpcontent.com/mcp_apps";
                }
                if ((ze0Var2 instanceof ye0) || (ze0Var2 instanceof ve0)) {
                    return "https://staging.claudemcpcontent.com/mcp_apps";
                }
                if ((ze0Var2 instanceof we0) || (ze0Var2 instanceof ue0)) {
                    return "http://localhost:4010/mcp_apps";
                }
                mr9.b();
                return null;
            case g.AVG_FIELD_NUMBER /* 18 */:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                Context contextG = yb5.g(m7fVar14);
                kce kceVar5 = jce.a;
                return new zd5(contextG, ((m26) m7fVar14.a(kceVar5.b(m26.class), null, null)).a(), (kea) m7fVar14.a(kceVar5.b(kea.class), null, null), (b4e) m7fVar14.a(kceVar5.b(b4e.class), null, null));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar15 = (m7f) obj;
                m7fVar15.getClass();
                ((bsc) obj2).getClass();
                return new abg((fk0) m7fVar15.a(jce.a.b(fk0.class), null, null));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                m7f m7fVar16 = (m7f) obj;
                m7fVar16.getClass();
                ((bsc) obj2).getClass();
                kce kceVar6 = jce.a;
                return new mie((qi3) m7fVar16.a(kceVar6.b(qi3.class), null, null), (mn5) m7fVar16.a(kceVar6.b(mn5.class), null, null), (String) m7fVar16.a(kceVar6.b(String.class), nai.k, null), yb5.w(w1a.E, new hk5(m7fVar16, 3)), (dmi) m7fVar16.a(kceVar6.b(dmi.class), null, null));
            case 21:
                m7f m7fVar17 = (m7f) obj;
                m7fVar17.getClass();
                ((bsc) obj2).getClass();
                kce kceVar7 = jce.a;
                ArrayList arrayListB = m7fVar17.b(kceVar7.b(h89.class));
                gdc gdcVar = new gdc();
                gdcVar.x = blj.c(b2c.d);
                gdcVar.z = blj.c(b2c.c);
                gdcVar.c(b2c.b);
                f89 f89Var = (f89) m7fVar17.a(kceVar7.b(zd5.class), null, null);
                ArrayList arrayList = gdcVar.c;
                arrayList.add(f89Var);
                arrayList.add((f89) m7fVar17.a(kceVar7.b(ike.class), null, null));
                arrayList.add((f89) m7fVar17.a(kceVar7.b(abg.class), null, null));
                arrayList.add((f89) m7fVar17.a(kceVar7.b(mie.class), null, null));
                arrayList.add(new h());
                gdcVar.e = new cd(17, new io.sentry.okhttp.g());
                arrayList.add((f89) m7fVar17.a(kceVar7.b(bl5.class), null, null));
                arrayList.add(new lde());
                Iterator it = arrayListB.iterator();
                if (!it.hasNext()) {
                    return new hdc(gdcVar);
                }
                it.next().getClass();
                mr9.o();
                return null;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m7f m7fVar18 = (m7f) obj;
                m7fVar18.getClass();
                ((bsc) obj2).getClass();
                kce kceVar8 = jce.a;
                return kgh.p(((ze0) m7fVar18.a(kceVar8.b(ze0.class), null, null)).a(), "/mobile/web-view-sandbox-runtime/", ((koi) m7fVar18.a(kceVar8.b(koi.class), null, null)).e, "/");
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar19 = (m7f) obj;
                m7fVar19.getClass();
                ((bsc) obj2).getClass();
                kce kceVar9 = jce.a;
                return kgh.p(bsg.n1(((ze0) m7fVar19.a(kceVar9.b(ze0.class), null, null)).a(), '/'), "/mobile/mcp-app-runtime/", ((koi) m7fVar19.a(kceVar9.b(koi.class), null, null)).e, "/");
            case 24:
                m7f m7fVar20 = (m7f) obj;
                m7fVar20.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar3 = nai.h;
                kce kceVar10 = jce.a;
                gdc gdcVarB = ((hdc) m7fVar20.a(kceVar10.b(hdc.class), mrgVar3, null)).b();
                gdcVarB.k = (i25) m7fVar20.a(kceVar10.b(i25.class), null, null);
                return new hdc(gdcVarB);
            case BuildConfig.VERSION_CODE /* 25 */:
                m7f m7fVar21 = (m7f) obj;
                m7fVar21.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar4 = b2c.a;
                kce kceVar11 = jce.a;
                return b2c.a((hdc) m7fVar21.a(kceVar11.b(hdc.class), null, null), (String) m7fVar21.a(kceVar11.b(String.class), nai.k, null), (bg9) m7fVar21.a(kceVar11.b(bg9.class), null, null), new qf0((cj3) m7fVar21.a(kceVar11.b(cj3.class), null, null), null));
            case 26:
                m7f m7fVar22 = (m7f) obj;
                m7fVar22.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar5 = nai.h;
                kce kceVar12 = jce.a;
                hdc hdcVar = (hdc) m7fVar22.a(kceVar12.b(hdc.class), mrgVar5, null);
                i25 i25Var = (i25) m7fVar22.a(kceVar12.b(i25.class), null, null);
                gdc gdcVarB2 = hdcVar.b();
                gdcVarB2.k = i25Var;
                return new hdc(gdcVarB2);
            case 27:
                m7f m7fVar23 = (m7f) obj;
                m7fVar23.getClass();
                ((bsc) obj2).getClass();
                kce kceVar13 = jce.a;
                hdc hdcVar2 = (hdc) m7fVar23.a(kceVar13.b(hdc.class), null, null);
                bc5 bc5Var = (bc5) m7fVar23.a(kceVar13.b(bc5.class), null, null);
                gdc gdcVarB3 = hdcVar2.b();
                jb5 jb5Var = bc5Var.a;
                ArrayList arrayList2 = gdcVarB3.c;
                arrayList2.add(jb5Var);
                arrayList2.add(bc5Var.b);
                return new hdc(gdcVarB3);
            case 28:
                m7f m7fVar24 = (m7f) obj;
                m7fVar24.getClass();
                ((bsc) obj2).getClass();
                kce kceVar14 = jce.a;
                SseConfig sseConfig = (SseConfig) ((rc8) m7fVar24.a(kceVar14.b(m78.class), null, null)).i(SseConfig.FEATURE_KEY, SseConfig.Companion.serializer());
                if (sseConfig != null) {
                    long read_timeout_seconds = sseConfig.getRead_timeout_seconds();
                    lz1 lz1Var = uh6.F;
                    jR = v40.R(read_timeout_seconds, zh6.SECONDS);
                } else {
                    jR = b2c.e;
                }
                gdc gdcVarB4 = ((hdc) m7fVar24.a(kceVar14.b(hdc.class), nai.i, null)).b();
                gdcVarB4.c(jR);
                return new s17(new hdc(gdcVarB4));
            default:
                m7f m7fVar25 = (m7f) obj;
                m7fVar25.getClass();
                ((bsc) obj2).getClass();
                kce kceVar15 = jce.a;
                return new qf0((cj3) m7fVar25.a(kceVar15.b(cj3.class), null, null), (q61) m7fVar25.a(kceVar15.b(q61.class), null, null));
        }
    }
}
