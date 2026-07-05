package defpackage;

import com.anthropic.claude.api.experience.ExperienceButton;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yqd extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Iterator G;
    public int H;
    public final /* synthetic */ ExperienceButton I;
    public final /* synthetic */ k87 J;
    public final /* synthetic */ pz7 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqd(ExperienceButton experienceButton, k87 k87Var, pz7 pz7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = experienceButton;
        this.J = k87Var;
        this.K = pz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new yqd(this.I, this.J, this.K, tp4Var, 0);
            default:
                return new yqd(this.I, this.J, this.K, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((yqd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:15:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009e -> B:35:0x00a2). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.E
            iei r1 = defpackage.iei.a
            pz7 r2 = r10.K
            k87 r3 = r10.J
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            m45 r5 = defpackage.m45.E
            r6 = 1
            com.anthropic.claude.api.experience.ExperienceButton r7 = r10.I
            r8 = 0
            r9 = 0
            switch(r0) {
                case 0: goto L68;
                default: goto L14;
            }
        L14:
            int r0 = r10.H
            if (r0 == 0) goto L27
            if (r0 != r6) goto L22
            int r0 = r10.F
            java.util.Iterator r4 = r10.G
            defpackage.sf5.h0(r11)
            goto L4e
        L22:
            defpackage.sz6.j(r4)
            r1 = r9
            goto L67
        L27:
            defpackage.sf5.h0(r11)
            java.util.List r11 = r7.getActions()
            java.util.Iterator r11 = r11.iterator()
            r4 = r11
            r0 = r6
        L34:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L58
            java.lang.Object r11 = r4.next()
            com.anthropic.claude.api.experience.ExperienceClientAction r11 = (com.anthropic.claude.api.experience.ExperienceClientAction) r11
            r10.G = r4
            r10.F = r0
            r10.H = r6
            java.lang.Object r11 = r3.a(r11, r9, r10)
            if (r11 != r5) goto L4e
            r1 = r5
            goto L67
        L4e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L34
            r0 = r8
            goto L34
        L58:
            java.util.List r10 = r7.getActions()
            if (r0 == 0) goto L5f
            goto L60
        L5f:
            r6 = r8
        L60:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            r2.invoke(r10, r11)
        L67:
            return r1
        L68:
            int r0 = r10.H
            if (r0 == 0) goto L7b
            if (r0 != r6) goto L76
            int r0 = r10.F
            java.util.Iterator r4 = r10.G
            defpackage.sf5.h0(r11)
            goto La2
        L76:
            defpackage.sz6.j(r4)
            r1 = r9
            goto Lbb
        L7b:
            defpackage.sf5.h0(r11)
            java.util.List r11 = r7.getActions()
            java.util.Iterator r11 = r11.iterator()
            r4 = r11
            r0 = r6
        L88:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Lac
            java.lang.Object r11 = r4.next()
            com.anthropic.claude.api.experience.ExperienceClientAction r11 = (com.anthropic.claude.api.experience.ExperienceClientAction) r11
            r10.G = r4
            r10.F = r0
            r10.H = r6
            java.lang.Object r11 = r3.a(r11, r9, r10)
            if (r11 != r5) goto La2
            r1 = r5
            goto Lbb
        La2:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L88
            r0 = r8
            goto L88
        Lac:
            java.util.List r10 = r7.getActions()
            if (r0 == 0) goto Lb3
            goto Lb4
        Lb3:
            r6 = r8
        Lb4:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            r2.invoke(r10, r11)
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
