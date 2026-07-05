package defpackage;

import android.content.Context;
import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.bell.tts.f;
import java.io.File;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class v2h extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2h(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0294, code lost:
    
        if (defpackage.m9j.O(r3, r0, r14, r25) == r9) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r0.b(r25, r2) == r9) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028a A[Catch: all -> 0x003b, CancellationException -> 0x0043, Exception -> 0x013e, TRY_LEAVE, TryCatch #1 {Exception -> 0x013e, blocks: (B:105:0x028a, B:62:0x0103, B:66:0x0141, B:67:0x0142, B:69:0x0148, B:70:0x0160, B:85:0x01f0, B:73:0x0194, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:79:0x01ba, B:81:0x01c0, B:82:0x01de, B:84:0x01e4, B:86:0x01fd, B:88:0x0203, B:89:0x021a, B:92:0x022c, B:93:0x0239, B:95:0x023f, B:97:0x024e, B:98:0x0252, B:100:0x0258, B:101:0x0276, B:103:0x027c, B:48:0x00b2), top: B:114:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148 A[Catch: all -> 0x003b, CancellationException -> 0x0043, Exception -> 0x013e, TryCatch #1 {Exception -> 0x013e, blocks: (B:105:0x028a, B:62:0x0103, B:66:0x0141, B:67:0x0142, B:69:0x0148, B:70:0x0160, B:85:0x01f0, B:73:0x0194, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:79:0x01ba, B:81:0x01c0, B:82:0x01de, B:84:0x01e4, B:86:0x01fd, B:88:0x0203, B:89:0x021a, B:92:0x022c, B:93:0x0239, B:95:0x023f, B:97:0x024e, B:98:0x0252, B:100:0x0258, B:101:0x0276, B:103:0x027c, B:48:0x00b2), top: B:114:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160 A[Catch: all -> 0x003b, CancellationException -> 0x0043, Exception -> 0x013e, TryCatch #1 {Exception -> 0x013e, blocks: (B:105:0x028a, B:62:0x0103, B:66:0x0141, B:67:0x0142, B:69:0x0148, B:70:0x0160, B:85:0x01f0, B:73:0x0194, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:79:0x01ba, B:81:0x01c0, B:82:0x01de, B:84:0x01e4, B:86:0x01fd, B:88:0x0203, B:89:0x021a, B:92:0x022c, B:93:0x0239, B:95:0x023f, B:97:0x024e, B:98:0x0252, B:100:0x0258, B:101:0x0276, B:103:0x027c, B:48:0x00b2), top: B:114:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203 A[Catch: all -> 0x003b, CancellationException -> 0x0043, Exception -> 0x013e, TryCatch #1 {Exception -> 0x013e, blocks: (B:105:0x028a, B:62:0x0103, B:66:0x0141, B:67:0x0142, B:69:0x0148, B:70:0x0160, B:85:0x01f0, B:73:0x0194, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:79:0x01ba, B:81:0x01c0, B:82:0x01de, B:84:0x01e4, B:86:0x01fd, B:88:0x0203, B:89:0x021a, B:92:0x022c, B:93:0x0239, B:95:0x023f, B:97:0x024e, B:98:0x0252, B:100:0x0258, B:101:0x0276, B:103:0x027c, B:48:0x00b2), top: B:114:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021a A[Catch: all -> 0x003b, CancellationException -> 0x0043, Exception -> 0x013e, TryCatch #1 {Exception -> 0x013e, blocks: (B:105:0x028a, B:62:0x0103, B:66:0x0141, B:67:0x0142, B:69:0x0148, B:70:0x0160, B:85:0x01f0, B:73:0x0194, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:79:0x01ba, B:81:0x01c0, B:82:0x01de, B:84:0x01e4, B:86:0x01fd, B:88:0x0203, B:89:0x021a, B:92:0x022c, B:93:0x0239, B:95:0x023f, B:97:0x024e, B:98:0x0252, B:100:0x0258, B:101:0x0276, B:103:0x027c, B:48:0x00b2), top: B:114:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v2h.d(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new v2h((f) obj2, tp4Var, 0);
            case 1:
                v2h v2hVar = new v2h((lf9) this.H, (pz7) obj2, tp4Var, 1);
                v2hVar.G = obj;
                return v2hVar;
            case 2:
                return new v2h((pz7) this.G, (nwb) this.H, (nwb) obj2, tp4Var, 2);
            case 3:
                v2h v2hVar2 = new v2h((f8h) this.H, (String) obj2, tp4Var, 3);
                v2hVar2.G = obj;
                return v2hVar2;
            case 4:
                return new v2h((e9h) this.G, (String) this.H, (TaskStepResponse) obj2, tp4Var, 4);
            case 5:
                return new v2h((peh) this.H, (jeh) obj2, tp4Var, 5);
            case 6:
                return new v2h((sih) this.G, (e8d) this.H, (ytf) obj2, tp4Var, 6);
            case 7:
                return new v2h((xmh) this.G, (Context) this.H, (JsonObject) obj2, tp4Var, 7);
            case 8:
                v2h v2hVar3 = new v2h((pz7) this.H, (poc) obj2, tp4Var, 8);
                v2hVar3.G = obj;
                return v2hVar3;
            case 9:
                return new v2h((fti) obj2, tp4Var, 9);
            case 10:
                return new v2h((x4j) this.G, (String) this.H, (File) obj2, tp4Var, 10);
            case 11:
                return new v2h((List) this.G, (xs5) this.H, (String) obj2, tp4Var, 11);
            case 12:
                return new v2h((m9j) this.H, (Context) obj2, tp4Var, 12);
            case 13:
                return new v2h((wig) this.G, (tgj) this.H, (bec) obj2, tp4Var, 13);
            default:
                return new v2h((qhj) this.G, (zaa) this.H, (wfj) obj2, tp4Var, 14);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((v2h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0477, code lost:
    
        if (r0.invoke(r26) == r3) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05a1, code lost:
    
        if (r3.invoke(r2, r26) == r0) goto L251;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0471  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v2h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2h(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2h(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
    }
}
