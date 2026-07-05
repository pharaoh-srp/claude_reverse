package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bo extends m08 implements pz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(em2 em2Var, int i) {
        super(2, 0, em2.class, em2Var, "onToolUseStop", "onToolUseStop-76MgMXk(Lcom/anthropic/claude/api/chat/messages/ToolUseBlock;Ljava/lang/String;)V");
        this.E = i;
        switch (i) {
            case 4:
                super(2, 0, em2.class, em2Var, "onToolResultStop", "onToolResultStop-76MgMXk(Lcom/anthropic/claude/api/chat/messages/ToolResultBlock;Ljava/lang/String;)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02f7  */
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
    @Override // defpackage.pz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(j8i j8iVar) {
        super(2, 0, j8i.class, j8iVar, "trackReloginCompleted", "trackReloginCompleted(ZLjava/lang/String;)V");
        this.E = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(Object obj) {
        super(2, 0, t53.class, obj, "trackChatInputBannerActioned", "trackChatInputBannerActioned(Ljava/util/List;Z)V");
        this.E = 5;
    }
}
