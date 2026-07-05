package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gjb {
    public final fjb[] a;
    public final long b;

    public gjb(List list) {
        this((fjb[]) list.toArray(new fjb[0]));
    }

    public final gjb a(fjb... fjbVarArr) {
        if (fjbVarArr.length == 0) {
            return this;
        }
        String str = tpi.a;
        fjb[] fjbVarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(fjbVarArr2, fjbVarArr2.length + fjbVarArr.length);
        System.arraycopy(fjbVarArr, 0, objArrCopyOf, fjbVarArr2.length, fjbVarArr.length);
        return new gjb(this.b, (fjb[]) objArrCopyOf);
    }

    public final gjb b(gjb gjbVar) {
        return gjbVar == null ? this : a(gjbVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gjb.class == obj.getClass()) {
            gjb gjbVar = (gjb) obj;
            if (Arrays.equals(this.a, gjbVar.a) && this.b == gjbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return dkk.i(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public gjb(long j, fjb... fjbVarArr) {
        this.b = j;
        this.a = fjbVarArr;
    }

    public gjb(fjb... fjbVarArr) {
        this(-9223372036854775807L, fjbVarArr);
    }
}
