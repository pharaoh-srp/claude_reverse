package defpackage;

import android.graphics.Path;
import android.os.Handler;
import android.os.SystemClock;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.health.HealthMetricReport;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.gson.JsonIOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wg6 implements zd7, jfd, bp9, uk8, io0, hba, lz7, za2, x35 {
    public static final wg6 F = new wg6(0);
    public static final wg6 G = new wg6(1);
    public static final wg6 H = new wg6(2);
    public final /* synthetic */ int E;

    public /* synthetic */ wg6(int i) {
        this.E = i;
    }

    public static /* synthetic */ void i() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void j(String str, Object obj) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // defpackage.x35
    public void a(Path path, v35 v35Var, float f, float f2, float f3, float f4) {
        path.getClass();
        int iOrdinal = v35Var.ordinal();
        if (iOrdinal == 0) {
            path.lineTo(f, f4);
            return;
        }
        if (iOrdinal == 1) {
            path.lineTo(f3, f2);
            return;
        }
        if (iOrdinal == 2) {
            path.lineTo(f, f4);
        } else if (iOrdinal == 3) {
            path.lineTo(f3, f2);
        } else {
            i();
        }
    }

    @Override // defpackage.lz7
    public Object apply(Object obj) {
        wd7 wd7Var = (wd7) obj;
        wd7Var.getClass();
        return wd7Var.getClass().getSimpleName();
    }

    @Override // defpackage.io0
    public int b(int i, fu9 fu9Var) {
        float f = (i + 0) / 2.0f;
        fu9 fu9Var2 = fu9.E;
        float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (fu9Var != fu9Var2) {
            f2 = MTTypesetterKt.kLineSkipLimitMultiplier * (-1.0f);
        }
        return Math.round((1.0f + f2) * f);
    }

    @Override // defpackage.jfd
    public Object c(ybi ybiVar) throws GeneralSecurityException {
        xf3 xf3Var = new xf3();
        if (gid.a(1)) {
            return xf3Var;
        }
        rl7.j("Can not use AES-CMAC in FIPS-mode.");
        return null;
    }

    @Override // defpackage.za2
    public void cancel() {
    }

    @Override // defpackage.zd7
    public wd7[] d() {
        switch (this.E) {
            case 5:
                return new wd7[]{new v4()};
            case 6:
                return new wd7[]{new x4()};
            case 7:
                return new wd7[]{new ef()};
            default:
                return new wd7[]{new sw()};
        }
    }

    public List e(String str, boolean z, boolean z2) {
        return s6b.e(str, z, z2);
    }

    @Override // defpackage.uk8
    public void g(HealthMetricReport healthMetricReport) {
    }

    @Override // defpackage.bp9
    public ybi h(jud judVar) throws GeneralSecurityException {
        wg wgVar;
        int i = 9;
        int i2 = 4;
        int i3 = 3;
        switch (this.E) {
            case 9:
                if (!((String) judVar.b).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    sz6.p("Wrong type URL in call to AesCmacParameters.parseParameters");
                    return null;
                }
                try {
                    sf sfVarD = sf.D((k22) judVar.d, mc7.a());
                    if (sfVarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    xv8 xv8Var = new xv8(i2);
                    xv8Var.F = null;
                    xv8Var.G = null;
                    xv8Var.H = zf.J;
                    xv8Var.B(sfVarD.z().size());
                    int iY = sfVarD.A().y();
                    if (iY < 10 || 16 < iY) {
                        throw new GeneralSecurityException(grc.p(iY, "Invalid tag size for AesCmacParameters: "));
                    }
                    xv8Var.G = Integer.valueOf(iY);
                    xv8Var.H = dg.a((bmc) judVar.f);
                    ag agVarC = xv8Var.c();
                    xv8 xv8Var2 = new xv8(i3);
                    xv8Var2.G = null;
                    xv8Var2.H = null;
                    xv8Var2.F = agVarC;
                    xv8Var2.G = new xzd(i, n22.a(sfVarD.z().h()));
                    xv8Var2.H = (Integer) judVar.g;
                    return xv8Var2.b();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                    rl7.j("Parsing AesCmacKey failed");
                    return null;
                }
            case 10:
                if (!((String) judVar.b).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    sz6.p("Wrong type URL in call to AesEaxParameters.parseParameters");
                    return null;
                }
                try {
                    sg sgVarD = sg.D((k22) judVar.d, mc7.a());
                    if (sgVarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    wg wgVar2 = wg.I;
                    int size = sgVarD.z().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iY2 = sgVarD.A().y();
                    if (iY2 != 12 && iY2 != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iY2)));
                    }
                    bmc bmcVar = (bmc) judVar.f;
                    int iOrdinal = bmcVar.ordinal();
                    if (iOrdinal == 1) {
                        wgVar2 = wg.G;
                    } else if (iOrdinal == 2) {
                        wgVar2 = wg.H;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bmcVar.b());
                        }
                        wgVar2 = wg.H;
                    }
                    xg xgVar = new xg(size, iY2, 16, wgVar2);
                    xv8 xv8Var3 = new xv8(5);
                    xv8Var3.G = null;
                    xv8Var3.H = null;
                    xv8Var3.F = xgVar;
                    xv8Var3.G = new xzd(i, n22.a(sgVarD.z().h()));
                    xv8Var3.H = (Integer) judVar.g;
                    return xv8Var3.e();
                } catch (InvalidProtocolBufferException unused2) {
                    rl7.j("Parsing AesEaxcKey failed");
                    return null;
                }
            case 11:
                if (!((String) judVar.b).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    sz6.p("Wrong type URL in call to AesGcmParameters.parseParameters");
                    return null;
                }
                try {
                    dh dhVarB = dh.B((k22) judVar.d, mc7.a());
                    if (dhVarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zf zfVar = zf.M;
                    int size2 = dhVarB.y().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    bmc bmcVar2 = (bmc) judVar.f;
                    int iOrdinal2 = bmcVar2.ordinal();
                    if (iOrdinal2 == 1) {
                        zfVar = zf.K;
                    } else if (iOrdinal2 == 2) {
                        zfVar = zf.L;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bmcVar2.b());
                        }
                        zfVar = zf.L;
                    }
                    hh hhVar = new hh(size2, 12, 16, zfVar);
                    xv8 xv8Var4 = new xv8(6);
                    xv8Var4.G = null;
                    xv8Var4.H = null;
                    xv8Var4.F = hhVar;
                    xv8Var4.G = new xzd(i, n22.a(dhVarB.y().h()));
                    xv8Var4.H = (Integer) judVar.g;
                    return xv8Var4.f();
                } catch (InvalidProtocolBufferException unused3) {
                    rl7.j("Parsing AesGcmKey failed");
                    return null;
                }
            case 12:
                if (!((String) judVar.b).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    sz6.p("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                    return null;
                }
                try {
                    lh lhVarB = lh.B((k22) judVar.d, mc7.a());
                    if (lhVarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    wg wgVar3 = wg.L;
                    int size3 = lhVarB.y().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    bmc bmcVar3 = (bmc) judVar.f;
                    int iOrdinal3 = bmcVar3.ordinal();
                    if (iOrdinal3 == 1) {
                        wgVar3 = wg.J;
                    } else if (iOrdinal3 == 2) {
                        wgVar3 = wg.K;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bmcVar3.b());
                        }
                        wgVar3 = wg.K;
                    }
                    ph phVar = new ph(size3, wgVar3);
                    xv8 xv8Var5 = new xv8(7);
                    xv8Var5.G = null;
                    xv8Var5.H = null;
                    xv8Var5.F = phVar;
                    xv8Var5.G = new xzd(i, n22.a(lhVarB.y().h()));
                    xv8Var5.H = (Integer) judVar.g;
                    return xv8Var5.g();
                } catch (InvalidProtocolBufferException unused4) {
                    rl7.j("Parsing AesGcmSivKey failed");
                    return null;
                }
            default:
                if (!((String) judVar.b).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    sz6.p("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                    return null;
                }
                try {
                    ng2 ng2VarB = ng2.B((k22) judVar.d, mc7.a());
                    if (ng2VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    bmc bmcVar4 = (bmc) judVar.f;
                    int iOrdinal4 = bmcVar4.ordinal();
                    if (iOrdinal4 == 1) {
                        wgVar = wg.M;
                    } else if (iOrdinal4 == 2) {
                        wgVar = wg.N;
                    } else if (iOrdinal4 == 3) {
                        wgVar = wg.O;
                    } else {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bmcVar4.b());
                        }
                        wgVar = wg.N;
                    }
                    return og2.v(wgVar, new xzd(i, n22.a(ng2VarB.y().h())), (Integer) judVar.g);
                } catch (InvalidProtocolBufferException unused5) {
                    rl7.j("Parsing ChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }

    @Override // defpackage.hba
    public void invoke(Object obj) {
        long jG;
        ax5 ax5Var;
        y77 y77Var;
        gv5 gv5Var;
        switch (this.E) {
            case 16:
                sp5 sp5Var = (sp5) obj;
                vp5 vp5Var = sp5Var.b;
                if (sp5Var == vp5Var.j && vp5Var.n != null) {
                    wtc wtcVar = vp5Var.p;
                    int i = wtcVar.b;
                    if (i != -1) {
                        long j = ((f51) wtcVar.e).f / i;
                        g61 g61Var = vp5Var.t;
                        g61Var.getClass();
                        jG = tpi.G(g61Var.a.getSampleRate(), j);
                    } else {
                        jG = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - vp5Var.W;
                    ax5 ax5Var2 = vp5Var.n;
                    int i2 = ((f51) vp5Var.p.e).f;
                    long jM = tpi.M(jG);
                    i49 i49Var = ((e6b) ax5Var2.F).m1;
                    Handler handler = (Handler) i49Var.F;
                    if (handler != null) {
                        handler.post(new n51(i49Var, i2, jM, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case g.MAX_FIELD_NUMBER /* 17 */:
                sp5 sp5Var2 = (sp5) obj;
                sp5Var2.getClass();
                vp5.c0.getAndDecrement();
                ax5 ax5Var3 = sp5Var2.b.n;
                if (ax5Var3 != null) {
                    int i3 = sp5Var2.a.a;
                    c0l c0lVar = new c0l(23);
                    i49 i49Var2 = ((e6b) ax5Var3.F).m1;
                    Handler handler2 = (Handler) i49Var2.F;
                    if (handler2 != null) {
                        handler2.post(new n51(i49Var2, c0lVar, 3));
                        return;
                    }
                    return;
                }
                return;
            case g.AVG_FIELD_NUMBER /* 18 */:
                sp5 sp5Var3 = (sp5) obj;
                vp5 vp5Var2 = sp5Var3.b;
                if (sp5Var3 == vp5Var2.j && (ax5Var = vp5Var2.n) != null && vp5Var2.O && (y77Var = ((e6b) ax5Var.F).m0) != null) {
                    y77Var.a();
                    return;
                }
                return;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                sp5 sp5Var4 = (sp5) obj;
                vp5 vp5Var3 = sp5Var4.b;
                if (sp5Var4 == vp5Var3.j && vp5Var3.M) {
                    vp5Var3.N = true;
                    return;
                }
                return;
            default:
                ax5 ax5Var4 = ((rp5) obj).a.n;
                if (ax5Var4 != null) {
                    e6b e6bVar = (e6b) ax5Var4.F;
                    synchronized (e6bVar.E) {
                        gv5Var = e6bVar.V;
                        break;
                    }
                    if (gv5Var != null) {
                        synchronized (gv5Var.c) {
                            gv5Var.f.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void l() {
    }
}
