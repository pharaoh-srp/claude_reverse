package defpackage;

import com.anthropic.claude.conway.protocol.ContainerGoneResponse;
import com.anthropic.claude.conway.protocol.ContainerReplacedException;
import com.anthropic.claude.conway.protocol.MintTokenResponse;
import java.io.IOException;
import java.util.Map;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class rs4 {
    public static final p8b g;
    public final String a;
    public final String b;
    public final h86 c;
    public final hdc d;
    public final hdc e;
    public final Map f;

    static {
        ide ideVar = p8b.e;
        g = nai.D("application/json");
    }

    public rs4(String str, String str2, String str3, h86 h86Var, hdc hdcVar) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str3;
        this.c = h86Var;
        this.d = hdcVar;
        gdc gdcVarB = hdcVar.b();
        lz1 lz1Var = uh6.F;
        gdcVarB.c(v40.Q(15, zh6.SECONDS));
        this.e = new hdc(gdcVarB);
        this.f = sta.h0(new cpc("Cookie", "sessionKey=".concat(str2)), new cpc("x-organization-uuid", str3));
    }

    public static final tkb a(rs4 rs4Var, String str) {
        ContainerGoneResponse containerGoneResponse;
        int i = 0;
        String strN0 = isg.n0(isg.n0(str, "\\", "\\\\", false), "\"", "\\\"", false);
        sie sieVar = tie.Companion;
        String strJ = ij0.j("{\"containerId\":\"", strN0, "\"}");
        sieVar.getClass();
        rie rieVarB = sie.b(strJ, g);
        hdc hdcVar = rs4Var.d;
        jie jieVar = new jie();
        jieVar.g(rs4Var.a + "/sandbox/mint-token");
        rs4Var.b(jieVar);
        jieVar.e("POST", rieVarB);
        pqe pqeVarF = new f4e(hdcVar, new kie(jieVar), false).f();
        int i2 = pqeVarF.H;
        try {
            String strF = pqeVarF.K.f();
            if (i2 == 410) {
                try {
                    ih9 ih9Var = ex4.a;
                    ih9Var.getClass();
                    containerGoneResponse = (ContainerGoneResponse) ih9Var.b(strF, ContainerGoneResponse.Companion.serializer());
                } catch (SerializationException unused) {
                    containerGoneResponse = null;
                }
                String currentContainerId = containerGoneResponse != null ? containerGoneResponse.getCurrentContainerId() : null;
                if (currentContainerId != null && currentContainerId.length() != 0) {
                    throw new ContainerReplacedException(currentContainerId);
                }
            }
            if (!pqeVarF.U) {
                throw new IOException("mint-token failed (HTTP " + i2 + ") — " + bsg.j1(200, bsg.k1(strF).toString()));
            }
            ih9 ih9Var2 = ex4.a;
            ih9Var2.getClass();
            MintTokenResponse mintTokenResponse = (MintTokenResponse) ih9Var2.b(strF, MintTokenResponse.Companion.serializer());
            if (mintTokenResponse.getJwt().length() == 0) {
                throw new IOException("mint-token: no jwt in response");
            }
            int expiresAt = (int) (mintTokenResponse.getExpiresAt() - (System.currentTimeMillis() / 1000));
            String jwt = mintTokenResponse.getJwt();
            if (expiresAt >= 0) {
                i = expiresAt;
            }
            tkb tkbVar = new tkb(jwt, i);
            pqeVarF.close();
            return tkbVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                wd6.Z(pqeVarF, th);
                throw th2;
            }
        }
    }

    public final void b(jie jieVar) {
        for (Map.Entry entry : this.f.entrySet()) {
            jieVar.d((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (r14 == r9) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r11, boolean r12, boolean r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs4.c(java.lang.String, boolean, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:32|33|97|34|(4:37|93|38|35)|103|41|(3:43|(2:46|44)|104)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0192, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[Catch: IOException -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0059, blocks: (B:28:0x009a, B:32:0x00b2, B:17:0x0055), top: B:91:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f A[Catch: IOException -> 0x00da, TryCatch #1 {IOException -> 0x00da, blocks: (B:51:0x0121, B:64:0x018a, B:54:0x012f, B:55:0x013a, B:57:0x0140, B:58:0x0151, B:60:0x0157, B:61:0x0178, B:63:0x017e, B:38:0x00c7, B:41:0x00dd, B:43:0x00e5, B:44:0x0107, B:46:0x010d), top: B:93:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0211 -> B:13:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r19, defpackage.vp4 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs4.d(java.lang.String, vp4):java.lang.Object");
    }
}
