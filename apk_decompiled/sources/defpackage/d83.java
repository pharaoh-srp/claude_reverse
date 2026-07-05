package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d83 implements sz7 {
    public final /* synthetic */ rwe E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ t53 G;

    public d83(rwe rweVar, qi3 qi3Var, t53 t53Var) {
        this.E = rweVar;
        this.F = qi3Var;
        this.G = t53Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // defpackage.sz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r12 = this;
            r4 = r13
            com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource r4 = (com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource) r4
            r13 = r14
            com.anthropic.claude.types.strings.MessageId r13 = (com.anthropic.claude.types.strings.MessageId) r13
            java.lang.String r3 = r13.m1057unboximpl()
            r13 = r15
            java.lang.Number r13 = (java.lang.Number) r13
            int r7 = r13.intValue()
            r13 = r16
            com.anthropic.claude.api.chat.ChatFeedback r13 = (com.anthropic.claude.api.chat.ChatFeedback) r13
            r4.getClass()
            r3.getClass()
            if (r13 == 0) goto L2d
            com.anthropic.claude.api.chat.ChatFeedbackType r13 = r13.getType()
            if (r13 == 0) goto L2d
            com.anthropic.claude.api.chat.ChatFeedbackType r0 = com.anthropic.claude.api.chat.ChatFeedbackType.UPVOTE
            if (r13 != r0) goto L28
            r13 = 0
        L28:
            if (r13 != 0) goto L2b
            goto L2d
        L2b:
            r8 = r13
            goto L30
        L2d:
            com.anthropic.claude.api.chat.ChatFeedbackType r13 = com.anthropic.claude.api.chat.ChatFeedbackType.FLAG_OTHER
            goto L2b
        L30:
            com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination$Feedback r5 = new com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination$Feedback
            r10 = 8
            r11 = 0
            r9 = 0
            r6 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13 = 1
            com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination[] r13 = new com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination[r13]
            r0 = 0
            r13[r0] = r5
            fv r0 = new fv
            r1 = 19
            r0.<init>(r1, r13)
            p23 r13 = new p23
            r1 = 20
            r13.<init>(r1)
            rwe r1 = r12.E
            gmf r1 = r1.E
            r1.m(r0, r13)
            com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked r0 = new com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked
            t53 r13 = r12.G
            koi r1 = r13.d
            java.lang.String r1 = r1.e
            java.lang.String r2 = r13.L0
            com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction r5 = com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction.FEEDBACK_NEGATIVE
            r7 = 32
            r8 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            zy2 r13 = com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked.Companion
            kotlinx.serialization.KSerializer r13 = r13.serializer()
            znf r13 = (defpackage.znf) r13
            qi3 r12 = r12.F
            r12.e(r0, r13)
            iei r12 = defpackage.iei.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d83.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
