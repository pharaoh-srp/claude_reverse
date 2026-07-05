package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class toh {
    public final ipc a;
    public final ipc b;
    public final u0h c;
    public final u0h d;

    public toh(ipc ipcVar, ipc ipcVar2) {
        this.a = ipcVar;
        this.b = ipcVar2;
        final int i = 0;
        this.c = new u0h(new zy7(this) { // from class: soh
            public final /* synthetic */ toh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2;
                int i3 = i;
                toh tohVar = this.F;
                switch (i3) {
                    case 0:
                        ipc ipcVar3 = tohVar.a;
                        ipc ipcVar4 = lja.a0;
                        int i4 = (ipcVar3 == ipcVar4 ? 1 : 0) + 1;
                        if (tohVar.b == ipcVar4) {
                            i4++;
                        }
                        return Integer.valueOf(i4);
                    default:
                        if (((Number) tohVar.c.getValue()).intValue() != 2) {
                            return a5.L;
                        }
                        ooh[] oohVarArr = new ooh[2];
                        for (int i5 = 0; i5 < 2; i5++) {
                            oohVarArr[i5] = null;
                        }
                        ipc ipcVar5 = tohVar.a;
                        ipc ipcVar6 = lja.a0;
                        if (ipcVar5 != ipcVar6) {
                            i2 = 0;
                        } else {
                            oohVarArr[0] = ooh.E;
                            i2 = 1;
                        }
                        int i6 = i2 + 1;
                        oohVarArr[i2] = ooh.F;
                        if (tohVar.b == ipcVar6) {
                            oohVarArr[i6] = ooh.G;
                        }
                        ooh oohVar = oohVarArr[0];
                        oohVar.getClass();
                        ooh oohVar2 = oohVarArr[1];
                        oohVar2.getClass();
                        return new a9i(oohVar, oohVar2);
                }
            }
        });
        final int i2 = 1;
        this.d = new u0h(new zy7(this) { // from class: soh
            public final /* synthetic */ toh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22;
                int i3 = i2;
                toh tohVar = this.F;
                switch (i3) {
                    case 0:
                        ipc ipcVar3 = tohVar.a;
                        ipc ipcVar4 = lja.a0;
                        int i4 = (ipcVar3 == ipcVar4 ? 1 : 0) + 1;
                        if (tohVar.b == ipcVar4) {
                            i4++;
                        }
                        return Integer.valueOf(i4);
                    default:
                        if (((Number) tohVar.c.getValue()).intValue() != 2) {
                            return a5.L;
                        }
                        ooh[] oohVarArr = new ooh[2];
                        for (int i5 = 0; i5 < 2; i5++) {
                            oohVarArr[i5] = null;
                        }
                        ipc ipcVar5 = tohVar.a;
                        ipc ipcVar6 = lja.a0;
                        if (ipcVar5 != ipcVar6) {
                            i22 = 0;
                        } else {
                            oohVarArr[0] = ooh.E;
                            i22 = 1;
                        }
                        int i6 = i22 + 1;
                        oohVarArr[i22] = ooh.F;
                        if (tohVar.b == ipcVar6) {
                            oohVarArr[i6] = ooh.G;
                        }
                        ooh oohVar = oohVarArr[0];
                        oohVar.getClass();
                        ooh oohVar2 = oohVarArr[1];
                        oohVar2.getClass();
                        return new a9i(oohVar, oohVar2);
                }
            }
        });
    }

    public final ipc a(ooh oohVar) {
        int iOrdinal = oohVar.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return lja.a0;
        }
        if (iOrdinal == 2) {
            return this.b;
        }
        mr9.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toh)) {
            return false;
        }
        toh tohVar = (toh) obj;
        return this.a == tohVar.a && this.b == tohVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((lja.a0.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ThreePaneScaffoldValue(primary=" + this.a + ", secondary=" + lja.a0 + ", tertiary=" + this.b + ')';
    }
}
