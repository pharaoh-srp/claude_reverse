package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u5j implements fjb {
    public final String a;
    public final String b;

    public u5j(String str, String str2) {
        this.a = auk.n(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fjb
    public final void b(m7b m7bVar) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numM = nwk.m(str2);
                if (numM != null) {
                    m7bVar.i = numM;
                }
                break;
            case 1:
                Integer numM2 = nwk.m(str2);
                if (numM2 != null) {
                    m7bVar.v = numM2;
                }
                break;
            case 2:
                Integer numM3 = nwk.m(str2);
                if (numM3 != null) {
                    m7bVar.h = numM3;
                }
                break;
            case 3:
                m7bVar.c = str2;
                break;
            case 4:
                m7bVar.w = str2;
                break;
            case 5:
                m7bVar.a = str2;
                break;
            case 6:
                m7bVar.e = str2;
                break;
            case 7:
                Integer numM4 = nwk.m(str2);
                if (numM4 != null) {
                    m7bVar.u = numM4;
                }
                break;
            case 8:
                m7bVar.d = str2;
                break;
            case 9:
                m7bVar.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u5j.class == obj.getClass()) {
            u5j u5jVar = (u5j) obj;
            if (this.a.equals(u5jVar.a) && this.b.equals(u5jVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + kgh.l(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
