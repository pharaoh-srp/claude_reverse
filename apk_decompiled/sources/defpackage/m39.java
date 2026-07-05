package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m39 implements o5b {
    public final /* synthetic */ long a;
    public final /* synthetic */ nwb b;

    public m39(long j, nwb nwbVar) {
        this.a = j;
        this.b = nwbVar;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        q5bVar.getClass();
        list.getClass();
        h5b h5bVar = (h5b) w44.g1(list);
        nm6 nm6Var = nm6.E;
        if (h5bVar == null) {
            return q5bVar.U(0, 0, nm6Var, new ed8(24));
        }
        c3d c3dVarU = h5bVar.u(this.a);
        long j2 = (((long) c3dVarU.E) << 32) | (((long) c3dVarU.F) & 4294967295L);
        nwb nwbVar = this.b;
        if (!g79.a(j2, (g79) nwbVar.getValue())) {
            nwbVar.setValue(new g79(j2));
        }
        return q5bVar.U((int) (j2 >> 32), (int) (j2 & 4294967295L), nm6Var, new b1(c3dVarU, 13));
    }
}
