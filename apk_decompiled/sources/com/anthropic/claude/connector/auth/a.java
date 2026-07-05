package com.anthropic.claude.connector.auth;

import android.content.Context;
import defpackage.c4a;
import defpackage.dae;
import defpackage.iei;
import defpackage.ii4;
import defpackage.l45;
import defpackage.lf9;
import defpackage.pz7;
import defpackage.si4;
import defpackage.tp4;
import defpackage.v84;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends xzg implements pz7 {
    public v84 E;
    public dae F;
    public lf9 G;
    public ii4 H;
    public Throwable I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ b L;
    public final /* synthetic */ String M;
    public final /* synthetic */ Context N;
    public final /* synthetic */ si4 O;
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ c4a R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Context context, si4 si4Var, String str2, String str3, c4a c4aVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.L = bVar;
        this.M = str;
        this.N = context;
        this.O = si4Var;
        this.P = str2;
        this.Q = str3;
        this.R = c4aVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        a aVar = new a(this.L, this.M, this.N, this.O, this.P, this.Q, this.R, tp4Var);
        aVar.K = obj;
        return aVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0190, code lost:
    
        if (defpackage.gb9.c0(r0, r1, r19) != r14) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: all -> 0x01c1, McpAuthException -> 0x01c4, TRY_LEAVE, TryCatch #12 {McpAuthException -> 0x01c4, all -> 0x01c1, blocks: (B:42:0x00fa, B:44:0x0100, B:80:0x01c7, B:82:0x01cb, B:84:0x01d5, B:87:0x01dd, B:88:0x01e6, B:89:0x01e7, B:90:0x01ec), top: B:110:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126 A[Catch: all -> 0x0038, McpAuthException -> 0x003b, TryCatch #6 {all -> 0x0038, blocks: (B:9:0x0031, B:60:0x0164, B:103:0x0206, B:104:0x0211, B:16:0x0046, B:57:0x014b, B:19:0x004f, B:48:0x0122, B:50:0x0126, B:52:0x012c, B:54:0x0132, B:66:0x0197, B:67:0x019e, B:68:0x019f, B:70:0x01aa, B:72:0x01b5, B:73:0x01b8, B:71:0x01b1, B:74:0x01b9, B:75:0x01c0, B:22:0x005e), top: B:109:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164 A[Catch: all -> 0x0038, McpAuthException -> 0x003b, PHI: r0 r2 r3
      0x0164: PHI (r0v46 java.lang.Object) = (r0v43 java.lang.Object), (r0v53 java.lang.Object) binds: [B:58:0x0160, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r2v29 ii4) = (r2v27 ii4), (r2v31 ii4) binds: [B:58:0x0160, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r3v26 ??) = (r3v28 ??), (r3v29 ??) binds: [B:58:0x0160, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {all -> 0x0038, blocks: (B:9:0x0031, B:60:0x0164, B:103:0x0206, B:104:0x0211, B:16:0x0046, B:57:0x014b, B:19:0x004f, B:48:0x0122, B:50:0x0126, B:52:0x012c, B:54:0x0132, B:66:0x0197, B:67:0x019e, B:68:0x019f, B:70:0x01aa, B:72:0x01b5, B:73:0x01b8, B:71:0x01b1, B:74:0x01b9, B:75:0x01c0, B:22:0x005e), top: B:109:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9 A[Catch: all -> 0x0038, McpAuthException -> 0x003b, TryCatch #6 {all -> 0x0038, blocks: (B:9:0x0031, B:60:0x0164, B:103:0x0206, B:104:0x0211, B:16:0x0046, B:57:0x014b, B:19:0x004f, B:48:0x0122, B:50:0x0126, B:52:0x012c, B:54:0x0132, B:66:0x0197, B:67:0x019e, B:68:0x019f, B:70:0x01aa, B:72:0x01b5, B:73:0x01b8, B:71:0x01b1, B:74:0x01b9, B:75:0x01c0, B:22:0x005e), top: B:109:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7 A[Catch: all -> 0x01c1, McpAuthException -> 0x01c4, TRY_ENTER, TryCatch #12 {McpAuthException -> 0x01c4, all -> 0x01c1, blocks: (B:42:0x00fa, B:44:0x0100, B:80:0x01c7, B:82:0x01cb, B:84:0x01d5, B:87:0x01dd, B:88:0x01e6, B:89:0x01e7, B:90:0x01ec), top: B:110:0x00fa }] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [ii4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [lf9] */
    /* JADX WARN: Type inference failed for: r3v10, types: [lf9] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [lf9] */
    /* JADX WARN: Type inference failed for: r3v22, types: [lf9] */
    /* JADX WARN: Type inference failed for: r3v24, types: [lf9] */
    /* JADX WARN: Type inference failed for: r3v26, types: [lf9] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.connector.auth.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
