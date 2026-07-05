package io.sentry.android.core.internal.tombstone;

import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.am4;
import defpackage.bi0;
import defpackage.bm4;
import defpackage.c0l;
import defpackage.cm4;
import defpackage.ctk;
import defpackage.gvh;
import defpackage.hw1;
import defpackage.kri;
import defpackage.mc1;
import defpackage.pde;
import defpackage.sq6;
import defpackage.ubb;
import defpackage.xh6;
import defpackage.zl4;
import io.sentry.j2;
import io.sentry.j5;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.d0;
import io.sentry.protocol.f;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.v;
import io.sentry.t5;
import io.sentry.x;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Closeable {
    public final InputStream E;
    public final List F;
    public final List G;
    public final String H;
    public final HashMap I;

    public b(InputStream inputStream, List list, List list2, String str) {
        HashMap map = new HashMap();
        this.I = map;
        this.E = inputStream;
        this.F = list;
        this.G = list2;
        this.H = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    public final j5 c() throws IOException {
        DebugImage debugImageG;
        DebugImage debugImageG2;
        kri kriVar;
        ArrayList arrayList;
        int i;
        kri kriVar2;
        kri kriVar3;
        ArrayList arrayList2;
        kri kriVar4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        kri kriVar5;
        kri kriVar6;
        kri kriVar7;
        InputStream inputStream = this.E;
        if (inputStream == null) {
            xh6.c("No InputStream provided; use parse(Tombstone) instead.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_LINEAR_DESIGN];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
        kri kriVar8 = new kri(byteArrayOutputStream.toByteArray());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str = "";
        int i3 = 0;
        int i4 = 0;
        String strF = "";
        bi0 bi0Var = null;
        while (true) {
            int iG = kriVar8.g();
            if (iG == 0) {
                String str2 = str;
                int i5 = i4;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                Collections.unmodifiableList(arrayList6);
                Collections.unmodifiableList(arrayList7);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Collections.unmodifiableMap(map2);
                List<ubb> listUnmodifiableList2 = Collections.unmodifiableList(arrayList8);
                Collections.unmodifiableList(arrayList9);
                Collections.unmodifiableList(arrayList10);
                j5 j5Var = new j5();
                j5Var.Y = t5.FATAL;
                j5Var.L = "native";
                p pVar = new p();
                String strJoin = String.join(" ", listUnmodifiableList);
                if (bi0Var != null) {
                    Locale locale = Locale.ROOT;
                    String strConcat = !strF.isEmpty() ? strF.concat(": ") : str2;
                    pVar.E = strConcat + "Fatal signal " + ((String) bi0Var.d) + " (" + bi0Var.b + "), " + ((String) bi0Var.e) + " (" + bi0Var.c + "), pid = " + i3 + " (" + strJoin + ")";
                } else {
                    Locale locale2 = Locale.ROOT;
                    pVar.E = "Fatal exit pid = " + i3 + " (" + strJoin + ")";
                }
                j5Var.U = pVar;
                ArrayList arrayList11 = new ArrayList();
                hw1 hw1Var = null;
                for (ubb ubbVar : listUnmodifiableList2) {
                    boolean z = ubbVar.d;
                    String str3 = ubbVar.f;
                    String str4 = ubbVar.e;
                    long j = ubbVar.b;
                    if (z && !str4.isEmpty() && !str4.startsWith("/dev/")) {
                        boolean zIsEmpty = str3.isEmpty();
                        boolean z2 = ubbVar.c == 0;
                        if (zIsEmpty || !z2) {
                            if (hw1Var != null && str4.equals((String) hw1Var.G)) {
                                hw1Var.F = j;
                            }
                        } else if (hw1Var == null || !str4.equals((String) hw1Var.G)) {
                            if (hw1Var != null && (debugImageG2 = hw1Var.g()) != null) {
                                arrayList11.add(debugImageG2);
                            }
                            hw1Var = new hw1();
                            hw1Var.G = str4;
                            hw1Var.H = str3;
                            hw1Var.E = ubbVar.a;
                            hw1Var.F = j;
                        } else {
                            hw1Var.F = j;
                        }
                    }
                }
                if (hw1Var != null && (debugImageG = hw1Var.g()) != null) {
                    arrayList11.add(debugImageG);
                }
                f fVar = new f();
                fVar.F = new ArrayList(arrayList11);
                j5Var.R = fVar;
                v vVar = new v();
                if (bi0Var != null) {
                    String str5 = (String) bi0Var.d;
                    vVar.E = str5;
                    vVar.F = (String) this.I.get(str5);
                    o oVar = new o();
                    oVar.E = a.TOMBSTONE.getValue();
                    oVar.H = Boolean.FALSE;
                    oVar.K = Boolean.TRUE;
                    HashMap map3 = new HashMap();
                    map3.put("number", Integer.valueOf(bi0Var.b));
                    map3.put("name", (String) bi0Var.d);
                    map3.put("code", Integer.valueOf(bi0Var.c));
                    map3.put("code_name", (String) bi0Var.e);
                    oVar.I = new HashMap(map3);
                    vVar.J = oVar;
                }
                vVar.H = Long.valueOf(i5);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add(vVar);
                j5Var.X = new j2(arrayList12);
                ArrayList arrayListE = j5Var.e();
                Objects.requireNonNull(arrayListE);
                v vVar2 = (v) arrayListE.get(0);
                ArrayList arrayList13 = new ArrayList();
                Iterator it = mapUnmodifiableMap.entrySet().iterator();
                while (it.hasNext()) {
                    gvh gvhVar = (gvh) ((Map.Entry) it.next()).getValue();
                    d0 d0Var = new d0();
                    d0Var.E = Long.valueOf(((Integer) r5.getKey()).intValue());
                    d0Var.G = gvhVar.b;
                    ArrayList arrayList14 = new ArrayList();
                    for (mc1 mc1Var : gvhVar.d) {
                        String str6 = mc1Var.c;
                        String str7 = mc1Var.b;
                        if (!str6.endsWith("libart.so") && (!str6.startsWith("<anonymous") || !str7.isEmpty())) {
                            a0 a0Var = new a0();
                            a0Var.P = str6;
                            a0Var.I = str7;
                            a0Var.U = String.format("0x%x", Long.valueOf(mc1Var.a));
                            Boolean boolC = str7.isEmpty() ? Boolean.FALSE : x.c(this.F, this.G, str7);
                            String str8 = this.H;
                            a0Var.O = Boolean.valueOf((boolC != null && boolC.booleanValue()) || (str8 != null && str6.startsWith(str8)));
                            arrayList14.add(0, a0Var);
                        }
                    }
                    c0 c0Var = new c0();
                    c0Var.E = arrayList14;
                    c0Var.H = b0.NONE;
                    HashMap map4 = new HashMap();
                    for (pde pdeVar : gvhVar.c) {
                        map4.put(pdeVar.a, String.format("0x%x", Long.valueOf(pdeVar.b)));
                    }
                    c0Var.F = map4;
                    d0Var.M = c0Var;
                    if (i5 == gvhVar.a) {
                        d0Var.I = Boolean.TRUE;
                        vVar2.I = c0Var;
                    }
                    arrayList13.add(d0Var);
                }
                j5Var.W = new j2(arrayList13);
                return j5Var;
            }
            int i6 = iG >>> 3;
            int i7 = iG & 7;
            String str9 = str;
            switch (i6) {
                case 1:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    i = i4;
                    kri.b(i6, 0, i7);
                    int i8 = (int) kriVar.i();
                    int[] iArrH = sq6.H(6);
                    int length = iArrH.length;
                    for (int i9 = 0; i9 < length && sq6.F(iArrH[i9]) != i8; i9++) {
                    }
                    i4 = i;
                    break;
                case 2:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    kri.b(i6, 2, i7);
                    kriVar.f();
                    break;
                case 3:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    kri.b(i6, 2, i7);
                    kriVar.f();
                    break;
                case 4:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    kri.b(i6, 2, i7);
                    kriVar.f();
                    break;
                case 5:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    i = i4;
                    kri.b(i6, 0, i7);
                    i3 = (int) kriVar.i();
                    i4 = i;
                    break;
                case 6:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    kri.b(i6, 0, i7);
                    i4 = (int) kriVar.i();
                    break;
                case 7:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    i = i4;
                    kri.b(i6, 0, i7);
                    kriVar.i();
                    i4 = i;
                    break;
                case 8:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    i = i4;
                    kri.b(i6, 2, i7);
                    kriVar.f();
                    i4 = i;
                    break;
                case 9:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    i = i4;
                    kri.b(i6, 2, i7);
                    arrayList5.add(kriVar.f());
                    i4 = i;
                    break;
                case 10:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    i = i4;
                    kri.b(i6, 2, i7);
                    kri kriVarE = kriVar.e();
                    String strF2 = str9;
                    String strF3 = strF2;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        int iG2 = kriVarE.g();
                        if (iG2 == 0) {
                            bi0Var = new bi0(i10, i11, strF2, strF3);
                            i4 = i;
                        } else {
                            int i12 = iG2 >>> 3;
                            int i13 = iG2 & 7;
                            switch (i12) {
                                case 1:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 0, i13);
                                    i10 = (int) kriVar2.i();
                                    break;
                                case 2:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 2, i13);
                                    strF2 = kriVar2.f();
                                    break;
                                case 3:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 0, i13);
                                    i11 = (int) kriVar2.i();
                                    break;
                                case 4:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 2, i13);
                                    strF3 = kriVar2.f();
                                    break;
                                case 5:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 0, i13);
                                    kriVar2.c();
                                    break;
                                case 6:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 0, i13);
                                    kriVar2.i();
                                    break;
                                case 7:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 0, i13);
                                    kriVar2.i();
                                    break;
                                case 8:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 0, i13);
                                    kriVar2.c();
                                    break;
                                case 9:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 0, i13);
                                    kriVar2.i();
                                    break;
                                case 10:
                                    kriVar2 = kriVarE;
                                    kri.b(i12, 2, i13);
                                    ctk.e(kriVar2.e());
                                    break;
                                default:
                                    kriVarE.j(i13);
                                    kriVar2 = kriVarE;
                                    break;
                            }
                            kriVarE = kriVar2;
                        }
                        break;
                    }
                    break;
                case 11:
                case 12:
                case 13:
                default:
                    kriVar8.j(i7);
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    i = i4;
                    i4 = i;
                    break;
                case 14:
                    kriVar = kriVar8;
                    arrayList = arrayList6;
                    kri.b(i6, 2, i7);
                    strF = kriVar.f();
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    kriVar = kriVar8;
                    i = i4;
                    int i14 = 2;
                    kri.b(i6, 2, i7);
                    kri kriVarE2 = kriVar.e();
                    while (true) {
                        int iG3 = kriVarE2.g();
                        if (iG3 == 0) {
                            arrayList = arrayList6;
                            arrayList7.add(new c0l(27));
                            i4 = i;
                        } else {
                            int i15 = iG3 >>> 3;
                            int i16 = iG3 & 7;
                            if (i15 != 1) {
                                if (i15 != i14) {
                                    kriVarE2.j(i16);
                                } else {
                                    kri.b(i15, i14, i16);
                                    kri kriVarE3 = kriVarE2.e();
                                    while (true) {
                                        int iG4 = kriVarE3.g();
                                        if (iG4 != 0) {
                                            int i17 = iG4 >>> 3;
                                            int i18 = iG4 & 7;
                                            kri kriVar9 = kriVarE2;
                                            if (i17 == 1) {
                                                kriVar4 = kriVarE3;
                                                arrayList3 = arrayList6;
                                                kri.b(i17, 0, i18);
                                                int i19 = (int) kriVar4.i();
                                                int[] iArrH2 = sq6.H(2);
                                                int length2 = iArrH2.length;
                                                for (int i20 = 0; i20 < length2 && sq6.F(iArrH2[i20]) != i19; i20++) {
                                                }
                                            } else if (i17 == i14) {
                                                kriVar4 = kriVarE3;
                                                arrayList3 = arrayList6;
                                                kri.b(i17, 0, i18);
                                                int i21 = (int) kriVar4.i();
                                                int[] iArrH3 = sq6.H(6);
                                                int length3 = iArrH3.length;
                                                for (int i22 = 0; i22 < length3 && sq6.F(iArrH3[i22]) != i21; i22++) {
                                                }
                                            } else if (i17 != 3) {
                                                kriVarE3.j(i18);
                                                kriVar4 = kriVarE3;
                                                arrayList3 = arrayList6;
                                            } else {
                                                kri.b(i17, i14, i18);
                                                kri kriVarE4 = kriVarE3.e();
                                                ArrayList arrayList15 = new ArrayList();
                                                ArrayList arrayList16 = new ArrayList();
                                                while (true) {
                                                    int iG5 = kriVarE4.g();
                                                    if (iG5 != 0) {
                                                        int i23 = iG5 >>> 3;
                                                        kri kriVar10 = kriVarE3;
                                                        int i24 = iG5 & 7;
                                                        switch (i23) {
                                                            case 1:
                                                                arrayList4 = arrayList6;
                                                                kri.b(i23, 0, i24);
                                                                kriVarE4.i();
                                                                break;
                                                            case 2:
                                                                arrayList4 = arrayList6;
                                                                kri.b(i23, 0, i24);
                                                                kriVarE4.i();
                                                                break;
                                                            case 3:
                                                                arrayList4 = arrayList6;
                                                                kri.b(i23, 0, i24);
                                                                kriVarE4.i();
                                                                break;
                                                            case 4:
                                                                arrayList4 = arrayList6;
                                                                kri.b(i23, 2, i24);
                                                                arrayList15.add(ctk.d(kriVarE4.e()));
                                                                break;
                                                            case 5:
                                                                arrayList4 = arrayList6;
                                                                kri.b(i23, 0, i24);
                                                                kriVarE4.i();
                                                                break;
                                                            case 6:
                                                                arrayList4 = arrayList6;
                                                                kri.b(i23, 2, i24);
                                                                arrayList16.add(ctk.d(kriVarE4.e()));
                                                                break;
                                                            default:
                                                                kriVarE4.j(i24);
                                                                arrayList4 = arrayList6;
                                                                break;
                                                        }
                                                        kriVarE3 = kriVar10;
                                                        arrayList6 = arrayList4;
                                                    } else {
                                                        kriVar4 = kriVarE3;
                                                        arrayList3 = arrayList6;
                                                        Collections.unmodifiableList(arrayList15);
                                                        Collections.unmodifiableList(arrayList16);
                                                    }
                                                }
                                            }
                                            kriVarE2 = kriVar9;
                                            kriVarE3 = kriVar4;
                                            arrayList6 = arrayList3;
                                            i14 = 2;
                                        }
                                    }
                                }
                                kriVar3 = kriVarE2;
                                arrayList2 = arrayList6;
                            } else {
                                kriVar3 = kriVarE2;
                                arrayList2 = arrayList6;
                                kri.b(i15, i14, i16);
                                kriVar3.f();
                            }
                            kriVarE2 = kriVar3;
                            arrayList6 = arrayList2;
                        }
                        break;
                    }
                    break;
                case 16:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 2, i7);
                    ctk.f(kriVar.e(), map);
                    arrayList = arrayList6;
                    i4 = i;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 2, i7);
                    kri kriVarE5 = kriVar.e();
                    String strF4 = str9;
                    String strF5 = strF4;
                    long jI = 0;
                    long jI2 = 0;
                    long jI3 = 0;
                    boolean zC = false;
                    while (true) {
                        int iG6 = kriVarE5.g();
                        if (iG6 == 0) {
                            arrayList8.add(new ubb(jI, jI2, jI3, zC, strF4, strF5));
                            arrayList = arrayList6;
                            i4 = i;
                            break;
                        } else {
                            int i25 = iG6 >>> 3;
                            int i26 = iG6 & 7;
                            switch (i25) {
                                case 1:
                                    kri.b(i25, 0, i26);
                                    jI = kriVarE5.i();
                                    break;
                                case 2:
                                    kri.b(i25, 0, i26);
                                    jI2 = kriVarE5.i();
                                    break;
                                case 3:
                                    kri.b(i25, 0, i26);
                                    jI3 = kriVarE5.i();
                                    break;
                                case 4:
                                    kri.b(i25, 0, i26);
                                    zC = kriVarE5.c();
                                    break;
                                case 5:
                                    kri.b(i25, 0, i26);
                                    kriVarE5.c();
                                    break;
                                case 6:
                                    kri.b(i25, 0, i26);
                                    kriVarE5.c();
                                    break;
                                case 7:
                                    kri.b(i25, 2, i26);
                                    strF4 = kriVarE5.f();
                                    break;
                                case 8:
                                    kri.b(i25, 2, i26);
                                    strF5 = kriVarE5.f();
                                    break;
                                case 9:
                                    kri.b(i25, 0, i26);
                                    kriVarE5.i();
                                    break;
                                default:
                                    kriVarE5.j(i26);
                                    break;
                            }
                        }
                    }
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 2, i7);
                    kri kriVarE6 = kriVar.e();
                    ArrayList arrayList17 = new ArrayList();
                    while (true) {
                        int iG7 = kriVarE6.g();
                        if (iG7 == 0) {
                            bm4 bm4Var = new bm4();
                            Collections.unmodifiableList(arrayList17);
                            arrayList9.add(bm4Var);
                            arrayList = arrayList6;
                            i4 = i;
                        } else {
                            int i27 = iG7 >>> 3;
                            int i28 = iG7 & 7;
                            if (i27 == 1) {
                                kriVar5 = kriVarE6;
                                kri.b(i27, 2, i28);
                                kriVar5.f();
                            } else if (i27 != 2) {
                                kriVarE6.j(i28);
                                kriVar5 = kriVarE6;
                            } else {
                                kri.b(i27, 2, i28);
                                kri kriVarE7 = kriVarE6.e();
                                while (true) {
                                    int iG8 = kriVarE7.g();
                                    if (iG8 != 0) {
                                        int i29 = iG8 >>> 3;
                                        int i30 = iG8 & 7;
                                        switch (i29) {
                                            case 1:
                                                kriVar6 = kriVarE6;
                                                kri.b(i29, 2, i30);
                                                kriVarE7.f();
                                                break;
                                            case 2:
                                                kriVar6 = kriVarE6;
                                                kri.b(i29, 0, i30);
                                                kriVarE7.i();
                                                break;
                                            case 3:
                                                kriVar6 = kriVarE6;
                                                kri.b(i29, 0, i30);
                                                kriVarE7.i();
                                                break;
                                            case 4:
                                                kriVar6 = kriVarE6;
                                                kri.b(i29, 0, i30);
                                                kriVarE7.i();
                                                break;
                                            case 5:
                                                kriVar6 = kriVarE6;
                                                kri.b(i29, 2, i30);
                                                kriVarE7.f();
                                                break;
                                            case 6:
                                                kriVar6 = kriVarE6;
                                                kri.b(i29, 2, i30);
                                                kriVarE7.f();
                                                break;
                                            default:
                                                kriVarE7.j(i30);
                                                kriVar6 = kriVarE6;
                                                break;
                                        }
                                        kriVarE6 = kriVar6;
                                    } else {
                                        kriVar5 = kriVarE6;
                                        arrayList17.add(new cm4());
                                    }
                                }
                            }
                            kriVarE6 = kriVar5;
                        }
                        break;
                    }
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    kriVar = kriVar8;
                    i = i4;
                    int i31 = 2;
                    kri.b(i6, 2, i7);
                    kri kriVarE8 = kriVar.e();
                    while (true) {
                        int iG9 = kriVarE8.g();
                        if (iG9 == 0) {
                            arrayList10.add(new am4(7));
                            arrayList = arrayList6;
                            i4 = i;
                        } else {
                            int i32 = iG9 >>> 3;
                            int i33 = iG9 & 7;
                            if (i32 == 1) {
                                kri.b(i32, 0, i33);
                                kriVarE8.i();
                            } else if (i32 == i31) {
                                kri.b(i32, i31, i33);
                                kriVarE8.f();
                            } else if (i32 == 3) {
                                kri.b(i32, i31, i33);
                                kriVarE8.f();
                            } else if (i32 != 4) {
                                kriVarE8.j(i33);
                            } else {
                                kri.b(i32, 0, i33);
                                kriVarE8.i();
                            }
                            i31 = 2;
                        }
                        break;
                    }
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 0, i7);
                    kriVar.i();
                    arrayList = arrayList6;
                    i4 = i;
                    break;
                case 21:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 2, i7);
                    kri kriVarE9 = kriVar.e();
                    while (true) {
                        int iG10 = kriVarE9.g();
                        if (iG10 == 0) {
                            arrayList6.add(new am4(1));
                            arrayList = arrayList6;
                            i4 = i;
                            break;
                        } else {
                            int i34 = iG10 >>> 3;
                            int i35 = iG10 & 7;
                            if (i34 == 1) {
                                kri.b(i34, 2, i35);
                                kriVarE9.d();
                            } else if (i34 != 2) {
                                kriVarE9.j(i35);
                            } else {
                                kri.b(i34, 2, i35);
                                kriVarE9.d();
                            }
                        }
                    }
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 0, i7);
                    kriVar.i();
                    arrayList = arrayList6;
                    i4 = i;
                    break;
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 0, i7);
                    kriVar.c();
                    arrayList = arrayList6;
                    i4 = i;
                    break;
                case 24:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 0, i7);
                    int i36 = (int) kriVar.i();
                    int[] iArrH4 = sq6.H(6);
                    int length4 = iArrH4.length;
                    for (int i37 = 0; i37 < length4 && sq6.F(iArrH4[i37]) != i36; i37++) {
                    }
                    arrayList = arrayList6;
                    i4 = i;
                    break;
                case BuildConfig.VERSION_CODE /* 25 */:
                    kriVar = kriVar8;
                    i = i4;
                    kri.b(i6, 2, i7);
                    ctk.f(kriVar.e(), map2);
                    arrayList = arrayList6;
                    i4 = i;
                    break;
                case 26:
                    kri.b(i6, 2, i7);
                    kri kriVarE10 = kriVar8.e();
                    ArrayList arrayList18 = new ArrayList();
                    while (true) {
                        int iG11 = kriVarE10.g();
                        if (iG11 == 0) {
                            kriVar = kriVar8;
                            i = i4;
                            Collections.unmodifiableList(arrayList18);
                            arrayList = arrayList6;
                            i4 = i;
                        } else {
                            kri kriVar11 = kriVar8;
                            int i38 = iG11 >>> 3;
                            int i39 = iG11 & 7;
                            int i40 = i4;
                            if (i38 == 1) {
                                kriVar7 = kriVarE10;
                                kri.b(i38, 0, i39);
                                kriVar7.i();
                            } else if (i38 != 2) {
                                kriVarE10.j(i39);
                                kriVar7 = kriVarE10;
                            } else {
                                kri.b(i38, 2, i39);
                                kri kriVarE11 = kriVarE10.e();
                                while (true) {
                                    int iG12 = kriVarE11.g();
                                    if (iG12 != 0) {
                                        int i41 = iG12 >>> 3;
                                        int i42 = iG12 & 7;
                                        kri kriVar12 = kriVarE10;
                                        if (i41 == 1) {
                                            kri.b(i41, 2, i42);
                                            ctk.d(kriVarE11.e());
                                        } else if (i41 == 2) {
                                            kri.b(i41, 0, i42);
                                            kriVarE11.i();
                                        } else if (i41 != 3) {
                                            kriVarE11.j(i42);
                                        } else {
                                            kri.b(i41, 0, i42);
                                            kriVarE11.i();
                                        }
                                        kriVarE10 = kriVar12;
                                    } else {
                                        kriVar7 = kriVarE10;
                                        arrayList18.add(new zl4(20));
                                    }
                                }
                            }
                            kriVarE10 = kriVar7;
                            kriVar8 = kriVar11;
                            i4 = i40;
                        }
                        break;
                    }
                    break;
            }
            str = str9;
            kriVar8 = kriVar;
            arrayList6 = arrayList;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.E;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
