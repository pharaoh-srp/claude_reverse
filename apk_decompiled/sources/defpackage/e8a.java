package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e8a implements y91 {
    public final nz8 a;
    public final int b;

    public e8a(int i, vde vdeVar) {
        this.b = i;
        this.a = vdeVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static e8a b(int i, ssc sscVar) {
        y91 zpgVar;
        String str;
        int i2 = 4;
        fok.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = sscVar.c;
        int iA = -2;
        int i4 = 0;
        while (sscVar.a() > 8) {
            int iO = sscVar.o();
            int iO2 = sscVar.b + sscVar.o();
            sscVar.L(iO2);
            if (iO != 1414744396) {
                ca1 ca1Var = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iS = sscVar.s();
                                String str2 = iS != 1 ? iS != 85 ? iS != 255 ? iS != 8192 ? iS != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iS2 = sscVar.s();
                                    int iO3 = sscVar.o();
                                    sscVar.N(6);
                                    int iS3 = sscVar.s();
                                    String str3 = tpi.a;
                                    int iS4 = tpi.s(iS3, ByteOrder.LITTLE_ENDIAN);
                                    int iS5 = sscVar.a() > 0 ? sscVar.s() : 0;
                                    iw7 iw7Var = new iw7();
                                    iw7Var.n = gkb.k(str2);
                                    iw7Var.F = iS2;
                                    iw7Var.G = iO3;
                                    if (str2.equals("audio/raw") && iS4 != 0) {
                                        iw7Var.H = iS4;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iS5 > 0) {
                                        byte[] bArr = new byte[iS5];
                                        sscVar.k(bArr, 0, iS5);
                                        iw7Var.q = nz8.u(bArr);
                                    }
                                    zpgVar = new zpg(new jw7(iw7Var));
                                } else {
                                    ebh.z("Ignoring track with unsupported format tag ", iS, "StreamFormatChunk");
                                }
                            } else {
                                ysj.u("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(tpi.u(iA)));
                            }
                            zpgVar = ca1Var;
                            break;
                        } else {
                            sscVar.N(i2);
                            int iO4 = sscVar.o();
                            int iO5 = sscVar.o();
                            sscVar.N(i2);
                            int iO6 = sscVar.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                iw7 iw7Var2 = new iw7();
                                iw7Var2.u = iO4;
                                iw7Var2.v = iO5;
                                iw7Var2.n = gkb.k(str);
                                zpgVar = new zpg(new jw7(iw7Var2));
                            } else {
                                ebh.z("Ignoring track with unsupported compression ", iO6, "StreamFormatChunk");
                                zpgVar = ca1Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = sscVar.o();
                        sscVar.N(8);
                        int iO8 = sscVar.o();
                        int iO9 = sscVar.o();
                        sscVar.N(i2);
                        sscVar.o();
                        sscVar.N(12);
                        zpgVar = new ba1(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = sscVar.o();
                        sscVar.N(12);
                        sscVar.o();
                        int iO11 = sscVar.o();
                        int iO12 = sscVar.o();
                        sscVar.N(i2);
                        int iO13 = sscVar.o();
                        int iO14 = sscVar.o();
                        sscVar.N(i2);
                        ca1Var = new ca1(iO10, iO11, iO12, iO13, iO14, sscVar.o());
                        zpgVar = ca1Var;
                        break;
                    case 1852994675:
                        zpgVar = new dqg(sscVar.x(sscVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        zpgVar = ca1Var;
                        break;
                }
            } else {
                zpgVar = b(sscVar.o(), sscVar);
            }
            if (zpgVar != null) {
                if (zpgVar.getType() == 1752331379) {
                    iA = ((ca1) zpgVar).a();
                }
                int i5 = i4 + 1;
                int iE = bz8.e(objArrCopyOf.length, i5);
                if (iE > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
                }
                objArrCopyOf[i4] = zpgVar;
                i4 = i5;
            }
            sscVar.M(iO2);
            sscVar.L(i3);
            i2 = 4;
        }
        return new e8a(i, nz8.m(i4, objArrCopyOf));
    }

    public final y91 a(Class cls) {
        iz8 iz8VarListIterator = this.a.listIterator(0);
        while (iz8VarListIterator.hasNext()) {
            y91 y91Var = (y91) iz8VarListIterator.next();
            if (y91Var.getClass() == cls) {
                return y91Var;
            }
        }
        return null;
    }

    @Override // defpackage.y91
    public final int getType() {
        return this.b;
    }
}
