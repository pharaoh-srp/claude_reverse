package defpackage;

import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class v78 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;

    public /* synthetic */ v78(int i, bz7 bz7Var) {
        this.E = i;
        this.F = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        long j;
        switch (this.E) {
            case 0:
                wcg wcgVar = (wcg) obj;
                synchronized (ycg.c) {
                    j = ycg.e;
                    ycg.e = 1 + j;
                }
                return new z3e(j, wcgVar, this.F);
            case 1:
                return this.F.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                String strM1071unboximpl = ((OrganizationId) obj).m1071unboximpl();
                strM1071unboximpl.getClass();
                bz7 bz7Var = this.F;
                OrganizationId.m1065boximpl(strM1071unboximpl).getClass();
                return bz7Var.invoke(OrganizationId.m1065boximpl(strM1071unboximpl));
        }
    }
}
