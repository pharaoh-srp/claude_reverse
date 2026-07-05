package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class ed3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed3(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new ed3((vd3) this.G, (String) obj2, tp4Var, 0);
            case 1:
                return new ed3((nwb) this.G, (vhc) obj2, tp4Var, 1);
            case 2:
                ed3 ed3Var = new ed3((isc) obj2, tp4Var, 2);
                ed3Var.G = obj;
                return ed3Var;
            case 3:
                return new ed3((uma) this.G, (bna) obj2, tp4Var, 3);
            case 4:
                return new ed3((hi6) this.G, (String) obj2, tp4Var, 4);
            case 5:
                return new ed3((bx1) this.G, (wlg) obj2, tp4Var, 5);
            case 6:
                ed3 ed3Var2 = new ed3((c) obj2, tp4Var, 6);
                ed3Var2.G = obj;
                return ed3Var2;
            case 7:
                return new ed3((c) this.G, (ybg) obj2, tp4Var, 7);
            case 8:
                return new ed3((i) this.G, (i55) obj2, tp4Var, 8);
            case 9:
                return new ed3((i) this.G, (NewCodeSessionPrefill) obj2, tp4Var, 9);
            case 10:
                return new ed3((i) this.G, (PermissionMode) obj2, tp4Var, 10);
            case 11:
                return new ed3((i) this.G, (ybg) obj2, tp4Var, 11);
            case 12:
                return new ed3((x0a) this.G, (i) obj2, tp4Var, 12);
            case 13:
                return new ed3((ieh) this.G, (sih) obj2, tp4Var, 13);
            case 14:
                return new ed3((vc4) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new ed3((yc4) this.G, (Runnable) obj2, tp4Var, 15);
            case 16:
                return new ed3((pz7) this.G, (l9d) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new ed3((hi4) this.G, (ri4) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new ed3((yih) this.G, (uj4) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new ed3((b0) this.G, (String) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new ed3((f) this.G, (b0) obj2, tp4Var, 20);
            case 21:
                return new ed3((bz7) this.G, (yih) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new ed3((p05) this.G, (String) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new ed3((e8d) this.G, (zhh) obj2, tp4Var, 23);
            case 24:
                ed3 ed3Var3 = new ed3((List) obj2, tp4Var, 24);
                ed3Var3.G = obj;
                return ed3Var3;
            case BuildConfig.VERSION_CODE /* 25 */:
                ed3 ed3Var4 = new ed3((Set) obj2, tp4Var, 25);
                ed3Var4.G = obj;
                return ed3Var4;
            case 26:
                return new ed3((jj5) this.G, (String) obj2, tp4Var, 26);
            case 27:
                return new ed3((rq5) obj2, tp4Var, 27);
            case 28:
                return new ed3((xq5) this.G, (t74) obj2, tp4Var, 28);
            default:
                return new ed3((eu5) this.G, (za1) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 7:
                ((ed3) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 11:
                ((ed3) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((ed3) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x04d6, code lost:
    
        if (defpackage.iuj.Q(5000, r3, r21) == r13) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (r1.b(r21, defpackage.tx5.a) == r13) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:472:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:491:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:379:0x06ce -> B:381:0x06d2). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed3(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
    }
}
