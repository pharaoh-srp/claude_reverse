package defpackage;

import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr9 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ql3 F;

    public /* synthetic */ kr9(ql3 ql3Var, int i) {
        this.E = i;
        switch (i) {
            case 1:
                break;
            default:
                q7f q7fVar = q7f.a;
                break;
        }
        this.F = ql3Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        ql3 ql3Var = this.F;
        switch (i) {
            case 0:
                ql3Var.a(q7f.a);
                return iei.a;
            default:
                m7f m7fVarD = ql3Var.d();
                if (m7fVarD == null) {
                    return null;
                }
                kce kceVar = jce.a;
                uz6 uz6Var = (uz6) m7fVarD.c(kceVar.b(uz6.class));
                OrganizationId organizationId = (OrganizationId) m7fVarD.c(kceVar.b(OrganizationId.class));
                String strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                if (uz6Var == null || strM1071unboximpl == null) {
                    return null;
                }
                return new zk8(uz6Var, strM1071unboximpl);
        }
    }
}
