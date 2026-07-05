package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eg2 extends hg2 {
    public final ssc h = new ssc();
    public final dg2 i = new dg2();
    public int j = -1;
    public final int k;
    public final cg2[] l;
    public cg2 m;
    public List n;
    public List o;
    public dg2 p;
    public int q;

    public eg2(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = q34.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new cg2[8];
        int i2 = 0;
        while (true) {
            cg2[] cg2VarArr = this.l;
            if (i2 >= 8) {
                this.m = cg2VarArr[0];
                return;
            } else {
                cg2VarArr[i2] = new cg2();
                i2++;
            }
        }
    }

    @Override // defpackage.hg2, defpackage.po5
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // defpackage.hg2
    public final ig2 g() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new ig2(list);
    }

    @Override // defpackage.hg2
    public final void h(fg2 fg2Var) {
        ByteBuffer byteBuffer = fg2Var.I;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ssc sscVar = this.h;
        sscVar.K(bArrArray, iLimit);
        while (sscVar.a() >= 3) {
            int iZ = sscVar.z();
            int i = iZ & 3;
            boolean z = (iZ & 4) == 4;
            byte bZ = (byte) sscVar.z();
            byte bZ2 = (byte) sscVar.z();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (bZ & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            ysj.u("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bZ & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        dg2 dg2Var = new dg2(i2, i4);
                        this.p = dg2Var;
                        byte[] bArr = dg2Var.b;
                        dg2Var.e = 1;
                        bArr[0] = bZ2;
                    } else {
                        fd9.E(i == 2);
                        dg2 dg2Var2 = this.p;
                        if (dg2Var2 == null) {
                            ysj.j("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = dg2Var2.b;
                            int i5 = dg2Var2.e;
                            int i6 = i5 + 1;
                            dg2Var2.e = i6;
                            bArr2[i5] = bZ;
                            dg2Var2.e = i5 + 2;
                            bArr2[i6] = bZ2;
                        }
                    }
                    dg2 dg2Var3 = this.p;
                    if (dg2Var3.e == (dg2Var3.d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // defpackage.hg2
    public final boolean j() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        char c;
        int i;
        boolean z;
        dg2 dg2Var = this.p;
        if (dg2Var == null) {
            return;
        }
        int i2 = 2;
        if (dg2Var.e != (dg2Var.d * 2) - 1) {
            ysj.i("DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        dg2 dg2Var2 = this.p;
        byte[] bArr = dg2Var2.b;
        int i3 = dg2Var2.e;
        dg2 dg2Var3 = this.i;
        dg2Var3.l(bArr, i3);
        boolean z2 = false;
        while (true) {
            if (dg2Var3.b() > 0) {
                int i4 = 3;
                int iG = dg2Var3.g(3);
                int iG2 = dg2Var3.g(5);
                if (iG == 7) {
                    dg2Var3.o(i2);
                    iG = dg2Var3.g(6);
                    if (iG < 7) {
                        ebh.z("Invalid extended service number: ", iG, "Cea708Decoder");
                    }
                }
                if (iG2 == 0) {
                    if (iG != 0) {
                        ysj.u("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                    }
                } else if (iG != this.k) {
                    dg2Var3.p(iG2);
                } else {
                    int iE = (iG2 * 8) + dg2Var3.e();
                    while (dg2Var3.e() < iE) {
                        int iG3 = dg2Var3.g(8);
                        if (iG3 != 16) {
                            if (iG3 <= 31) {
                                if (iG3 != 0) {
                                    if (iG3 == i4) {
                                        this.n = l();
                                    } else if (iG3 != 8) {
                                        switch (iG3) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (iG3 >= 17 && iG3 <= 23) {
                                                    ysj.u("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                    dg2Var3.o(8);
                                                } else if (iG3 < 24 || iG3 > 31) {
                                                    ebh.z("Invalid C0 command: ", iG3, "Cea708Decoder");
                                                } else {
                                                    ysj.u("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                    dg2Var3.o(16);
                                                }
                                                break;
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (iG3 <= 127) {
                                cg2 cg2Var = this.m;
                                if (iG3 == 127) {
                                    cg2Var.a((char) 9835);
                                } else {
                                    cg2Var.a((char) (iG3 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (iG3 <= 159) {
                                    cg2[] cg2VarArr = this.l;
                                    switch (iG3) {
                                        case FreeTypeConstants.FT_LOAD_PEDANTIC /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i5 = iG3 - 128;
                                            if (this.q != i5) {
                                                this.q = i5;
                                                this.m = cg2VarArr[i5];
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (dg2Var3.f()) {
                                                    cg2 cg2Var2 = cg2VarArr[8 - i6];
                                                    cg2Var2.a.clear();
                                                    cg2Var2.b.clear();
                                                    cg2Var2.o = -1;
                                                    cg2Var2.p = -1;
                                                    cg2Var2.q = -1;
                                                    cg2Var2.s = -1;
                                                    cg2Var2.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (dg2Var3.f()) {
                                                    cg2VarArr[8 - i7].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (dg2Var3.f()) {
                                                    cg2VarArr[8 - i8].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (dg2Var3.f()) {
                                                    cg2VarArr[8 - i9].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (dg2Var3.f()) {
                                                    cg2VarArr[8 - i10].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            dg2Var3.o(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            m();
                                            z = true;
                                            break;
                                        case 144:
                                            int i11 = i2;
                                            if (this.m.c) {
                                                dg2Var3.g(4);
                                                dg2Var3.g(i11);
                                                dg2Var3.g(i11);
                                                boolean zF = dg2Var3.f();
                                                boolean zF2 = dg2Var3.f();
                                                i4 = 3;
                                                dg2Var3.g(3);
                                                dg2Var3.g(3);
                                                this.m.e(zF, zF2);
                                                z = true;
                                            } else {
                                                dg2Var3.o(16);
                                                z = true;
                                                i4 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.m.c) {
                                                int iC = cg2.c(dg2Var3.g(2), dg2Var3.g(2), dg2Var3.g(2), dg2Var3.g(2));
                                                int iC2 = cg2.c(dg2Var3.g(2), dg2Var3.g(2), dg2Var3.g(2), dg2Var3.g(2));
                                                dg2Var3.o(2);
                                                cg2.c(dg2Var3.g(2), dg2Var3.g(2), dg2Var3.g(2), 0);
                                                this.m.f(iC, iC2);
                                            } else {
                                                dg2Var3.o(24);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                dg2Var3.o(4);
                                                int iG4 = dg2Var3.g(4);
                                                dg2Var3.o(2);
                                                dg2Var3.g(6);
                                                cg2 cg2Var3 = this.m;
                                                if (cg2Var3.u != iG4) {
                                                    cg2Var3.a('\n');
                                                }
                                                cg2Var3.u = iG4;
                                            } else {
                                                dg2Var3.o(16);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            ebh.z("Invalid C1 command: ", iG3, "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int iC3 = cg2.c(dg2Var3.g(2), dg2Var3.g(2), dg2Var3.g(2), dg2Var3.g(2));
                                                dg2Var3.g(2);
                                                cg2.c(dg2Var3.g(2), dg2Var3.g(2), dg2Var3.g(2), 0);
                                                dg2Var3.f();
                                                dg2Var3.f();
                                                dg2Var3.g(2);
                                                dg2Var3.g(2);
                                                int iG5 = dg2Var3.g(2);
                                                dg2Var3.o(8);
                                                cg2 cg2Var4 = this.m;
                                                cg2Var4.n = iC3;
                                                cg2Var4.k = iG5;
                                            } else {
                                                dg2Var3.o(32);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i12 = iG3 - 152;
                                            cg2 cg2Var5 = cg2VarArr[i12];
                                            dg2Var3.o(i2);
                                            boolean zF3 = dg2Var3.f();
                                            dg2Var3.o(i2);
                                            int iG6 = dg2Var3.g(i4);
                                            boolean zF4 = dg2Var3.f();
                                            int iG7 = dg2Var3.g(7);
                                            int iG8 = dg2Var3.g(8);
                                            int iG9 = dg2Var3.g(4);
                                            int iG10 = dg2Var3.g(4);
                                            dg2Var3.o(i2);
                                            dg2Var3.o(6);
                                            dg2Var3.o(i2);
                                            int iG11 = dg2Var3.g(3);
                                            int iG12 = dg2Var3.g(3);
                                            ArrayList arrayList = cg2Var5.a;
                                            cg2Var5.c = true;
                                            cg2Var5.d = zF3;
                                            cg2Var5.e = iG6;
                                            cg2Var5.f = zF4;
                                            cg2Var5.g = iG7;
                                            cg2Var5.h = iG8;
                                            cg2Var5.i = iG9;
                                            int i13 = iG10 + 1;
                                            if (cg2Var5.j != i13) {
                                                cg2Var5.j = i13;
                                                while (true) {
                                                    if (arrayList.size() >= cg2Var5.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iG11 != 0 && cg2Var5.l != iG11) {
                                                cg2Var5.l = iG11;
                                                int i14 = iG11 - 1;
                                                int i15 = cg2.B[i14];
                                                boolean z3 = cg2.A[i14];
                                                int i16 = cg2.y[i14];
                                                int i17 = cg2.z[i14];
                                                int i18 = cg2.x[i14];
                                                cg2Var5.n = i15;
                                                cg2Var5.k = i18;
                                            }
                                            if (iG12 != 0 && cg2Var5.m != iG12) {
                                                cg2Var5.m = iG12;
                                                int i19 = iG12 - 1;
                                                int i20 = cg2.D[i19];
                                                int i21 = cg2.C[i19];
                                                cg2Var5.e(false, false);
                                                cg2Var5.f(cg2.v, cg2.E[i19]);
                                            }
                                            if (this.q != i12) {
                                                this.q = i12;
                                                this.m = cg2VarArr[i12];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (iG3 <= 255) {
                                        this.m.a((char) (iG3 & 255));
                                    } else {
                                        ebh.z("Invalid base command: ", iG3, "Cea708Decoder");
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int iG13 = dg2Var3.g(8);
                            if (iG13 <= 31) {
                                c = 7;
                                if (iG13 > 7) {
                                    if (iG13 <= 15) {
                                        dg2Var3.o(8);
                                    } else if (iG13 <= 23) {
                                        dg2Var3.o(16);
                                    } else if (iG13 <= 31) {
                                        dg2Var3.o(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (iG13 <= 127) {
                                    if (iG13 == 32) {
                                        this.m.a(' ');
                                    } else if (iG13 == 33) {
                                        this.m.a((char) 160);
                                    } else if (iG13 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (iG13 == 42) {
                                        this.m.a((char) 352);
                                    } else if (iG13 == 44) {
                                        this.m.a((char) 338);
                                    } else if (iG13 == 63) {
                                        this.m.a((char) 376);
                                    } else if (iG13 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (iG13 == 58) {
                                        this.m.a((char) 353);
                                    } else if (iG13 == 60) {
                                        this.m.a((char) 339);
                                    } else if (iG13 != 61) {
                                        switch (iG13) {
                                            case mdj.f /* 48 */:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (iG13) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case ModuleDescriptor.MODULE_VERSION /* 122 */:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        ebh.z("Invalid G2 character: ", iG13, "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (iG13 > 159) {
                                    i = 2;
                                    if (iG13 <= 255) {
                                        if (iG13 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            ebh.z("Invalid G3 character: ", iG13, "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z2 = true;
                                    } else {
                                        ebh.z("Invalid extended command: ", iG13, "Cea708Decoder");
                                    }
                                } else if (iG13 <= 135) {
                                    dg2Var3.o(32);
                                } else if (iG13 <= 143) {
                                    dg2Var3.o(40);
                                } else if (iG13 <= 159) {
                                    i = 2;
                                    dg2Var3.o(2);
                                    dg2Var3.o(dg2Var3.g(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg2.l():java.util.List");
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
