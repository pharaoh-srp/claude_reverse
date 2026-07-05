package com.anthropic.claude.code.remote;

import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.sessions.types.PermissionMode;
import defpackage.iei;
import defpackage.l45;
import defpackage.leb;
import defpackage.pz7;
import defpackage.tp4;
import defpackage.xzg;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends xzg implements pz7 {
    public PermissionMode E;
    public int F;
    public final /* synthetic */ i G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ SessionTarget J;
    public final /* synthetic */ List K;
    public final /* synthetic */ String L;
    public final /* synthetic */ leb M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, String str2, SessionTarget sessionTarget, List list, String str3, leb lebVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = iVar;
        this.H = str;
        this.I = str2;
        this.J = sessionTarget;
        this.K = list;
        this.L = str3;
        this.M = lebVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new h(this.G, this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0180, code lost:
    
        if (r0 == r11) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x001e, B:79:0x0183, B:81:0x018d, B:84:0x0196, B:86:0x019a, B:88:0x019e, B:90:0x01a6, B:92:0x01b7, B:93:0x01bc, B:94:0x01bd, B:98:0x01cc, B:100:0x01d6, B:104:0x01df, B:14:0x0031, B:70:0x0163, B:74:0x0173, B:76:0x0177, B:15:0x0038, B:26:0x0099, B:28:0x009f, B:30:0x00aa, B:32:0x00ae, B:34:0x00b6, B:36:0x00ba, B:38:0x00c1, B:40:0x00cd, B:39:0x00c9, B:42:0x00d4, B:44:0x00d8, B:46:0x00e4, B:48:0x00ea, B:50:0x00f8, B:53:0x0100, B:67:0x0146, B:61:0x0117, B:63:0x011d, B:64:0x012f, B:66:0x0135, B:57:0x010a, B:106:0x01e5, B:107:0x01ea, B:18:0x0048, B:20:0x004c, B:23:0x007b, B:22:0x005f), top: B:125:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x001e, B:79:0x0183, B:81:0x018d, B:84:0x0196, B:86:0x019a, B:88:0x019e, B:90:0x01a6, B:92:0x01b7, B:93:0x01bc, B:94:0x01bd, B:98:0x01cc, B:100:0x01d6, B:104:0x01df, B:14:0x0031, B:70:0x0163, B:74:0x0173, B:76:0x0177, B:15:0x0038, B:26:0x0099, B:28:0x009f, B:30:0x00aa, B:32:0x00ae, B:34:0x00b6, B:36:0x00ba, B:38:0x00c1, B:40:0x00cd, B:39:0x00c9, B:42:0x00d4, B:44:0x00d8, B:46:0x00e4, B:48:0x00ea, B:50:0x00f8, B:53:0x0100, B:67:0x0146, B:61:0x0117, B:63:0x011d, B:64:0x012f, B:66:0x0135, B:57:0x010a, B:106:0x01e5, B:107:0x01ea, B:18:0x0048, B:20:0x004c, B:23:0x007b, B:22:0x005f), top: B:125:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cb  */
    /* JADX WARN: Type inference failed for: r0v33, types: [iqf] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.anthropic.claude.sessions.types.PermissionMode] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.anthropic.claude.sessions.types.BridgeEnvironmentInfo] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
