package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.webkit.WebView;
import androidx.health.platform.client.proto.g;
import coil.compose.AsyncImagePainter;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.bell.api.a1;
import java.util.List;
import java.util.Objects;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }

    private final Object d(Object obj) {
        m45 m45Var = m45.E;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            aid aidVar = (aid) this.G;
            ud1 ud1Var = (ud1) this.H;
            td1 td1Var = new td1(ud1Var, aidVar);
            ml4 ml4Var = ud1Var.a;
            ml4Var.getClass();
            synchronized (ml4Var.c) {
                try {
                    if (ml4Var.d.add(td1Var)) {
                        if (ml4Var.d.size() == 1) {
                            ml4Var.e = ml4Var.a();
                            nga ngaVarC = nga.c();
                            int i2 = nl4.a;
                            Objects.toString(ml4Var.e);
                            ngaVarC.getClass();
                            ml4Var.c();
                        }
                        td1Var.a(ml4Var.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            k6 k6Var = new k6((ud1) this.H, 28, td1Var);
            this.F = 1;
            if (v40.k(aidVar, k6Var, this) == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    private final Object n(Object obj) throws Throwable {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            b3f b3fVarD0 = mpk.d0(new d7(9, (ki1) this.G));
            i7 i7Var = new i7(5, (qd) this.H);
            this.F = 1;
            Object objA = b3fVarD0.a(i7Var, this);
            m45 m45Var = m45.E;
            if (objA == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    private final Object p(Object obj) {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            wa2 wa2VarR = j8.r(j8.b0(((m6b) this.G).N));
            i7 i7Var = new i7(6, (aid) this.H);
            this.F = 1;
            Object objA = wa2VarR.a(i7Var, this);
            m45 m45Var = m45.E;
            if (objA == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    private final Object r(Object obj) {
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.G;
        pi1 pi1Var = (pi1) this.H;
        int i = this.F;
        try {
            if (i == 0) {
                sf5.h0(obj);
                if (audioFocusRequest != null) {
                    p41 p41Var = pi1Var.b;
                    this.F = 1;
                    Object objE = p41Var.e(this);
                    m45 m45Var = m45.E;
                    if (objE == m45Var) {
                        return m45Var;
                    }
                }
                pi1Var.g.m(null);
                return iei.a;
            }
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
            AudioManager audioManager = pi1Var.a;
            if (audioManager != null) {
                wd6.U(audioManager.abandonAudioFocusRequest(audioFocusRequest));
            }
            pi1Var.g.m(null);
            return iei.a;
        } catch (Throwable th) {
            pi1Var.g.m(null);
            throw th;
        }
    }

    private final Object s(Object obj) {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            ih2 ih2VarB0 = j8.b0(((a1) ((yn1) this.G)).f);
            bj1 bj1Var = new bj1((ej1) this.H);
            this.F = 1;
            Object objA = ih2VarB0.a(bj1Var, this);
            m45 m45Var = m45.E;
            if (objA == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new m0((zub) this.G, (lp8) obj2, tp4Var, 0);
            case 1:
                return new m0((zub) this.G, (mp8) obj2, tp4Var, 1);
            case 2:
                return new m0((m8j) this.G, (WebView) obj2, tp4Var, 2);
            case 3:
                return new m0((w3c) this.G, obj2, tp4Var, 3);
            case 4:
                return new m0((f9) this.G, (bz7) obj2, tp4Var, 4);
            case 5:
                return new m0((Context) this.G, (Intent) obj2, tp4Var, 5);
            case 6:
                return new m0((sl) this.G, (nwb) obj2, tp4Var, 6);
            case 7:
                return new m0((dpf) this.G, (String) obj2, tp4Var, 7);
            case 8:
                m0 m0Var = new m0((lu) obj2, tp4Var, 8);
                m0Var.G = obj;
                return m0Var;
            case 9:
                m0 m0Var2 = new m0((uv) obj2, tp4Var, 9);
                m0Var2.G = obj;
                return m0Var2;
            case 10:
                return new m0((uv) this.G, (gnd) obj2, tp4Var, 10);
            case 11:
                return new m0((uv) this.G, (Project) obj2, tp4Var, 11);
            case 12:
                return new m0((gx) this.G, (String) obj2, tp4Var, 12);
            case 13:
                return new m0((bz7) this.G, (nwb) obj2, tp4Var, 13);
            case 14:
                return new m0((ky) this.G, (cc6) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new m0((e10) obj2, tp4Var, 15);
            case 16:
                return new m0((y20) this.G, (i49) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                m0 m0Var3 = new m0((r9d) obj2, tp4Var, 17);
                m0Var3.G = obj;
                return m0Var3;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new m0((xq0) this.G, (t4f) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new m0((op3) this.G, (tp0) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new m0((n01) this.G, (k20) obj2, tp4Var, 20);
            case 21:
                return new m0((AsyncImagePainter) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new m0((k21) this.G, (si7) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new m0((AudioManager) this.G, (List) obj2, tp4Var, 23);
            case 24:
                m0 m0Var4 = new m0((ud1) obj2, tp4Var, 24);
                m0Var4.G = obj;
                return m0Var4;
            case BuildConfig.VERSION_CODE /* 25 */:
                return new m0((ki1) this.G, (qd) obj2, tp4Var, 25);
            case 26:
                return new m0((m6b) this.G, (aid) obj2, tp4Var, 26);
            case 27:
                return new m0((AudioFocusRequest) this.G, (pi1) obj2, tp4Var, 27);
            case 28:
                return new m0((yn1) this.G, (ej1) obj2, tp4Var, 28);
            default:
                return new m0((fn1) this.G, (zy7) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 5:
                ((m0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((m0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:462:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0246 -> B:126:0x024a). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
    }
}
