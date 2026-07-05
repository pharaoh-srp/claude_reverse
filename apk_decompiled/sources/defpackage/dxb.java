package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class dxb extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public Object G;
    public Object H;
    public /* synthetic */ Object I;
    public Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(ContentResolver contentResolver, Uri uri, tq5 tq5Var, zy1 zy1Var, Context context, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = contentResolver;
        this.J = uri;
        this.K = tq5Var;
        this.L = zy1Var;
        this.M = context;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (i) {
            case 0:
                dxb dxbVar = new dxb((zwb) obj3, (fxb) obj4, (bz7) obj2, tp4Var);
                dxbVar.I = obj;
                return dxbVar;
            default:
                dxb dxbVar2 = new dxb((ContentResolver) this.I, (Uri) this.J, (tq5) obj4, (zy1) obj3, (Context) obj2, tp4Var);
                dxbVar2.G = obj;
                return dxbVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((dxb) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((dxb) create((lp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #3 {all -> 0x002e, blocks: (B:9:0x0028, B:19:0x0058, B:23:0x0069, B:25:0x0071, B:15:0x003e, B:18:0x0051), top: B:76:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Type inference failed for: r1v0, types: [hxb, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:10:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(zwb zwbVar, fxb fxbVar, bz7 bz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.L = zwbVar;
        this.K = fxbVar;
        this.M = bz7Var;
    }
}
