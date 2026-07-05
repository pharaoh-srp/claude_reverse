package defpackage;

import android.graphics.Rect;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.airbnb.lottie.parser.moshi.JsonEncodingException;
import com.airbnb.lottie.parser.moshi.c;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gna {
    public static final epk a = epk.v("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final epk b = epk.v("id", "layers", "w", "h", "p", "u");
    public static final epk c = epk.v("list");
    public static final epk d = epk.v("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static bna a(c cVar) throws JsonEncodingException, EOFException {
        bna bnaVar;
        float f;
        bna bnaVar2;
        float f2;
        bna bnaVar3;
        int i;
        float f3;
        bna bnaVar4;
        int i2;
        float f4;
        float f5;
        float fC = zpi.c();
        zka zkaVar = new zka((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        jgg jggVar = new jgg(0);
        bna bnaVar5 = new bna();
        cVar.beginObject();
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        float fNextDouble = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fNextDouble2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fNextDouble3 = MTTypesetterKt.kLineSkipLimitMultiplier;
        while (cVar.hasNext()) {
            switch (cVar.i(a)) {
                case 0:
                    bnaVar = bnaVar5;
                    iNextDouble = (int) cVar.nextDouble();
                    bnaVar5 = bnaVar;
                    break;
                case 1:
                    bnaVar = bnaVar5;
                    iNextDouble2 = (int) cVar.nextDouble();
                    bnaVar5 = bnaVar;
                    break;
                case 2:
                    bnaVar = bnaVar5;
                    fNextDouble2 = (float) cVar.nextDouble();
                    bnaVar5 = bnaVar;
                    break;
                case 3:
                    f = fC;
                    bnaVar2 = bnaVar5;
                    fNextDouble = ((float) cVar.nextDouble()) - 0.01f;
                    bnaVar5 = bnaVar2;
                    fC = f;
                    break;
                case 4:
                    f = fC;
                    bnaVar2 = bnaVar5;
                    fNextDouble3 = (float) cVar.nextDouble();
                    bnaVar5 = bnaVar2;
                    fC = f;
                    break;
                case 5:
                    f2 = fC;
                    bnaVar3 = bnaVar5;
                    i = iNextDouble2;
                    f3 = fNextDouble2;
                    String[] strArrSplit = cVar.nextString().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        bnaVar3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    bnaVar5 = bnaVar3;
                    iNextDouble2 = i;
                    fC = f2;
                    fNextDouble2 = f3;
                    break;
                case 6:
                    f2 = fC;
                    bna bnaVar6 = bnaVar5;
                    i = iNextDouble2;
                    f3 = fNextDouble2;
                    cVar.beginArray();
                    int i6 = 0;
                    while (cVar.hasNext()) {
                        bna bnaVar7 = bnaVar6;
                        rt9 rt9VarA = st9.a(cVar, bnaVar7);
                        if (rt9VarA.e == 3) {
                            i6++;
                        }
                        arrayList.add(rt9VarA);
                        zkaVar.f(rt9VarA.d, rt9VarA);
                        if (i6 > 4) {
                            oga.a("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        bnaVar6 = bnaVar7;
                    }
                    bnaVar3 = bnaVar6;
                    cVar.endArray();
                    bnaVar5 = bnaVar3;
                    iNextDouble2 = i;
                    fC = f2;
                    fNextDouble2 = f3;
                    break;
                case 7:
                    f2 = fC;
                    i = iNextDouble2;
                    f3 = fNextDouble2;
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        zka zkaVar2 = new zka((Object) null);
                        cVar.beginObject();
                        String strNextString = null;
                        String strNextString2 = null;
                        String strNextString3 = null;
                        int iNextInt = 0;
                        int iNextInt2 = 0;
                        while (cVar.hasNext()) {
                            int i7 = cVar.i(b);
                            if (i7 != 0) {
                                if (i7 == 1) {
                                    cVar.beginArray();
                                    while (cVar.hasNext()) {
                                        rt9 rt9VarA2 = st9.a(cVar, bnaVar5);
                                        zkaVar2.f(rt9VarA2.d, rt9VarA2);
                                        arrayList3.add(rt9VarA2);
                                        bnaVar5 = bnaVar5;
                                    }
                                    bnaVar4 = bnaVar5;
                                    cVar.endArray();
                                } else if (i7 == 2) {
                                    iNextInt = cVar.nextInt();
                                } else if (i7 == 3) {
                                    iNextInt2 = cVar.nextInt();
                                } else if (i7 == 4) {
                                    strNextString2 = cVar.nextString();
                                } else if (i7 != 5) {
                                    cVar.j();
                                    cVar.skipValue();
                                    bnaVar4 = bnaVar5;
                                } else {
                                    strNextString3 = cVar.nextString();
                                }
                                bnaVar5 = bnaVar4;
                            } else {
                                strNextString = cVar.nextString();
                            }
                        }
                        bna bnaVar8 = bnaVar5;
                        cVar.endObject();
                        if (strNextString2 != null) {
                            map2.put(strNextString, new rna(strNextString, strNextString2, iNextInt, iNextInt2, strNextString3));
                        } else {
                            map.put(strNextString, arrayList3);
                        }
                        bnaVar5 = bnaVar8;
                    }
                    cVar.endArray();
                    bnaVar3 = bnaVar5;
                    bnaVar5 = bnaVar3;
                    iNextDouble2 = i;
                    fC = f2;
                    fNextDouble2 = f3;
                    break;
                case 8:
                    f2 = fC;
                    int i8 = iNextDouble2;
                    float f6 = fNextDouble2;
                    cVar.beginObject();
                    while (cVar.hasNext()) {
                        if (cVar.i(c) != 0) {
                            cVar.j();
                            cVar.skipValue();
                        } else {
                            cVar.beginArray();
                            while (cVar.hasNext()) {
                                epk epkVar = eu7.a;
                                cVar.beginObject();
                                String strNextString4 = null;
                                String strNextString5 = null;
                                String strNextString6 = null;
                                while (cVar.hasNext()) {
                                    int i9 = i8;
                                    int i10 = cVar.i(eu7.a);
                                    if (i10 != 0) {
                                        float f7 = f6;
                                        if (i10 == 1) {
                                            strNextString5 = cVar.nextString();
                                        } else if (i10 == 2) {
                                            strNextString6 = cVar.nextString();
                                        } else if (i10 != 3) {
                                            cVar.j();
                                            cVar.skipValue();
                                        } else {
                                            cVar.nextDouble();
                                        }
                                        i8 = i9;
                                        f6 = f7;
                                    } else {
                                        strNextString4 = cVar.nextString();
                                        i8 = i9;
                                    }
                                }
                                cVar.endObject();
                                map3.put(strNextString5, new tt7(strNextString4, strNextString5, strNextString6));
                                i8 = i8;
                            }
                            cVar.endArray();
                        }
                    }
                    i = i8;
                    f3 = f6;
                    cVar.endObject();
                    bnaVar3 = bnaVar5;
                    bnaVar5 = bnaVar3;
                    iNextDouble2 = i;
                    fC = f2;
                    fNextDouble2 = f3;
                    break;
                case 9:
                    f2 = fC;
                    i2 = iNextDouble2;
                    f4 = fNextDouble2;
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        epk epkVar2 = vt7.a;
                        ArrayList arrayList4 = new ArrayList();
                        cVar.beginObject();
                        double dNextDouble = 0.0d;
                        char cCharAt = 0;
                        String strNextString7 = null;
                        String strNextString8 = null;
                        while (cVar.hasNext()) {
                            int i11 = cVar.i(vt7.a);
                            if (i11 == 0) {
                                cCharAt = cVar.nextString().charAt(0);
                            } else if (i11 == 1) {
                                cVar.nextDouble();
                            } else if (i11 == 2) {
                                dNextDouble = cVar.nextDouble();
                            } else if (i11 == 3) {
                                strNextString7 = cVar.nextString();
                            } else if (i11 == 4) {
                                strNextString8 = cVar.nextString();
                            } else if (i11 != 5) {
                                cVar.j();
                                cVar.skipValue();
                            } else {
                                cVar.beginObject();
                                while (cVar.hasNext()) {
                                    if (cVar.i(vt7.b) != 0) {
                                        cVar.j();
                                        cVar.skipValue();
                                    } else {
                                        cVar.beginArray();
                                        while (cVar.hasNext()) {
                                            arrayList4.add((o0g) do4.a(cVar, bnaVar5));
                                        }
                                        cVar.endArray();
                                    }
                                }
                                cVar.endObject();
                            }
                        }
                        cVar.endObject();
                        ut7 ut7Var = new ut7(arrayList4, cCharAt, dNextDouble, strNextString7, strNextString8);
                        jggVar.c(ut7Var.hashCode(), ut7Var);
                    }
                    cVar.endArray();
                    i = i2;
                    f3 = f4;
                    bnaVar3 = bnaVar5;
                    bnaVar5 = bnaVar3;
                    iNextDouble2 = i;
                    fC = f2;
                    fNextDouble2 = f3;
                    break;
                case 10:
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        cVar.beginObject();
                        String strNextString9 = null;
                        float fNextDouble4 = MTTypesetterKt.kLineSkipLimitMultiplier;
                        while (cVar.hasNext()) {
                            int i12 = cVar.i(d);
                            if (i12 != 0) {
                                f5 = fC;
                                if (i12 == 1) {
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble4 = (float) cVar.nextDouble();
                                    iNextDouble2 = iNextDouble2;
                                } else if (i12 != 2) {
                                    cVar.j();
                                    cVar.skipValue();
                                } else {
                                    cVar.nextDouble();
                                }
                            } else {
                                f5 = fC;
                                strNextString9 = cVar.nextString();
                            }
                            fC = f5;
                        }
                        cVar.endObject();
                        arrayList2.add(new gua(strNextString9, fNextDouble4));
                        iNextDouble2 = iNextDouble2;
                        fNextDouble2 = fNextDouble2;
                        fC = fC;
                    }
                    f2 = fC;
                    i2 = iNextDouble2;
                    f4 = fNextDouble2;
                    cVar.endArray();
                    i = i2;
                    f3 = f4;
                    bnaVar3 = bnaVar5;
                    bnaVar5 = bnaVar3;
                    iNextDouble2 = i;
                    fC = f2;
                    fNextDouble2 = f3;
                    break;
                default:
                    cVar.j();
                    cVar.skipValue();
                    f2 = fC;
                    bnaVar3 = bnaVar5;
                    i = iNextDouble2;
                    f3 = fNextDouble2;
                    bnaVar5 = bnaVar3;
                    iNextDouble2 = i;
                    fC = f2;
                    fNextDouble2 = f3;
                    break;
            }
        }
        float f8 = fC;
        bna bnaVar9 = bnaVar5;
        Rect rect = new Rect(0, 0, (int) (iNextDouble * f8), (int) (iNextDouble2 * f8));
        float fC2 = zpi.c();
        bnaVar9.k = rect;
        bnaVar9.l = fNextDouble2;
        bnaVar9.m = fNextDouble;
        bnaVar9.n = fNextDouble3;
        bnaVar9.j = arrayList;
        bnaVar9.i = zkaVar;
        bnaVar9.c = map;
        bnaVar9.d = map2;
        bnaVar9.e = fC2;
        bnaVar9.h = jggVar;
        bnaVar9.f = map3;
        bnaVar9.g = arrayList2;
        return bnaVar9;
    }
}
