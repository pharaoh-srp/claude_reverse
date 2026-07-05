package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.ListIterator;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class xn5 implements Decoder, ud4 {
    public static xre b;
    public static final sz6 a = new sz6(24);
    public static final q0g c = q0g.I;
    public static final float d = 8.0f;
    public static final float e = 24.0f;

    public static void A0(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        J0(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void B0(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iK0 = K0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        L0(parcel, iK0);
    }

    public static void C0(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        J0(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void D0(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        J0(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void E0(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iK0 = K0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        L0(parcel, iK0);
    }

    public static final void F(a6i a6iVar, iqb iqbVar, bz7 bz7Var, tt ttVar, bz7 bz7Var2, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var;
        rok rokVar;
        bz7 bz7Var3;
        i90 i90Var;
        kdg kdgVar;
        i90 i90Var2;
        q5i q5iVarU;
        e18 e18Var2;
        boolean z;
        bz7 bz7Var4 = bz7Var;
        rok rokVar2 = a6iVar.a;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(511725103);
        int i2 = (i & 6) == 0 ? (e18Var3.f(a6iVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var3.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var3.h(bz7Var4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var3.f(ttVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var3.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        ta4 ta4Var2 = ta4Var;
        if ((196608 & i) == 0) {
            i2 |= e18Var3.h(ta4Var2) ? 131072 : 65536;
        }
        if (e18Var3.Q(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objN = e18Var3.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new i90(a6iVar, ttVar);
                e18Var3.k0(objN);
            }
            i90 i90Var3 = (i90) objN;
            boolean z3 = i3 == 4;
            Object objN2 = e18Var3.N();
            Object obj = objN2;
            if (z3 || objN2 == lz1Var) {
                Object[] objArr = {rokVar2.q0()};
                kdg kdgVar2 = new kdg();
                kdgVar2.addAll(mp0.Y0(objArr));
                e18Var3.k0(kdgVar2);
                obj = kdgVar2;
            }
            kdg kdgVar3 = (kdg) obj;
            boolean z4 = i3 == 4;
            Object objN3 = e18Var3.N();
            if (z4 || objN3 == lz1Var) {
                long[] jArr = u6f.a;
                objN3 = new ewb();
                e18Var3.k0(objN3);
            }
            ewb ewbVar = (ewb) objN3;
            lsc lscVar = a6iVar.d;
            if (!kdgVar3.contains(rokVar2.q0())) {
                kdgVar3.clear();
                kdgVar3.add(rokVar2.q0());
            }
            if (x44.r(rokVar2.q0(), lscVar.getValue())) {
                if (kdgVar3.size() != 1 || !x44.r(kdgVar3.get(0), rokVar2.q0())) {
                    kdgVar3.clear();
                    kdgVar3.add(rokVar2.q0());
                }
                if (ewbVar.e != 1 || ewbVar.c(rokVar2.q0())) {
                    ewbVar.a();
                }
                i90Var3.b = ttVar;
            }
            if (x44.r(rokVar2.q0(), lscVar.getValue()) || kdgVar3.contains(lscVar.getValue())) {
                rokVar = rokVar2;
            } else {
                ListIterator listIterator = kdgVar3.listIterator();
                int i4 = 0;
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    rokVar = rokVar2;
                    if (!c8aVar.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (x44.r(bz7Var2.invoke(c8aVar.next()), bz7Var2.invoke(lscVar.getValue()))) {
                            break;
                        }
                        i4++;
                        rokVar2 = rokVar;
                    }
                }
                if (i4 == -1) {
                    kdgVar3.add(lscVar.getValue());
                } else {
                    kdgVar3.set(i4, lscVar.getValue());
                }
            }
            if (ewbVar.c(lscVar.getValue()) && ewbVar.c(rokVar.q0())) {
                e18Var3.a0(1968995539);
                e18Var3.p(false);
                bz7Var3 = bz7Var4;
                i90Var = i90Var3;
            } else {
                e18Var3.a0(1966410449);
                ewbVar.a();
                int size = kdgVar3.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj2 = kdgVar3.get(i5);
                    i90 i90Var4 = i90Var3;
                    ewbVar.m(obj2, fd9.q0(-23915175, new x80(a6iVar, obj2, bz7Var4, i90Var4, kdgVar3, ta4Var2), e18Var3));
                    ta4Var2 = ta4Var;
                    bz7Var4 = bz7Var4;
                    i90Var3 = i90Var4;
                }
                bz7Var3 = bz7Var4;
                i90Var = i90Var3;
                e18Var3.p(false);
            }
            boolean zF = e18Var3.f(a6iVar.f()) | e18Var3.f(i90Var);
            Object objN4 = e18Var3.N();
            if (zF || objN4 == lz1Var) {
                objN4 = (po4) bz7Var3.invoke(i90Var);
                e18Var3.k0(objN4);
            }
            po4 po4Var = (po4) objN4;
            a6i a6iVar2 = i90Var.a;
            boolean zF2 = e18Var3.f(i90Var);
            Object objN5 = e18Var3.N();
            if (zF2 || objN5 == lz1Var) {
                objN5 = mpk.P(Boolean.FALSE);
                e18Var3.k0(objN5);
            }
            nwb nwbVar = (nwb) objN5;
            nwb nwbVarZ = mpk.Z(po4Var.d, e18Var3);
            if (x44.r(a6iVar2.a.q0(), a6iVar2.d.getValue())) {
                nwbVar.setValue(Boolean.FALSE);
            } else if (nwbVarZ.getValue() != null) {
                nwbVar.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            iqb iqbVarW = fqb.E;
            if (zBooleanValue) {
                e18Var3.a0(1353077497);
                i90 i90Var5 = i90Var;
                kdgVar = kdgVar3;
                i90Var2 = i90Var5;
                e18 e18Var4 = e18Var3;
                q5iVarU = nai.u(i90Var5.a, dgj.m, null, e18Var4, 0, 2);
                boolean zF3 = e18Var4.f(q5iVarU);
                Object objN6 = e18Var4.N();
                if (zF3 || objN6 == lz1Var) {
                    a9g a9gVar = (a9g) nwbVarZ.getValue();
                    if (a9gVar == null || a9gVar.a) {
                        iqbVarW = W(iqbVarW);
                    }
                    e18Var4.k0(iqbVarW);
                    objN6 = iqbVarW;
                }
                iqbVarW = (iqb) objN6;
                e18Var4.p(false);
                e18Var2 = e18Var4;
            } else {
                kdgVar = kdgVar3;
                e18 e18Var5 = e18Var3;
                i90Var2 = i90Var;
                e18Var5.a0(1353343539);
                e18Var5.p(false);
                q5iVarU = null;
                e18Var2 = e18Var5;
            }
            iqb iqbVarB = iqbVar.B(iqbVarW.B(new e90(q5iVarU, nwbVarZ, i90Var2)));
            Object objN7 = e18Var2.N();
            if (objN7 == lz1Var) {
                objN7 = new b90(i90Var2);
                e18Var2.k0(objN7);
            }
            b90 b90Var = (b90) objN7;
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, b90Var);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.V(e18Var2, Integer.valueOf(iHashCode), cd4.g);
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            e18Var2.a0(-860173498);
            int size2 = kdgVar.size();
            int i6 = 0;
            while (i6 < size2) {
                kdg kdgVar4 = kdgVar;
                Object obj3 = kdgVar4.get(i6);
                e18Var2.X(-2026002954, bz7Var2.invoke(obj3));
                pz7 pz7Var = (pz7) ewbVar.g(obj3);
                if (pz7Var == null) {
                    e18Var2.a0(1618454323);
                    z = false;
                } else {
                    z = false;
                    e18Var2.a0(-2026001778);
                    pz7Var.invoke(e18Var2, 0);
                }
                e18Var2.p(z);
                e18Var2.p(z);
                i6++;
                kdgVar = kdgVar4;
            }
            e18Var2.p(false);
            e18Var2.p(true);
            e18Var = e18Var2;
        } else {
            e18 e18Var6 = e18Var3;
            e18Var6.T();
            e18Var = e18Var6;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new y80(a6iVar, iqbVar, bz7Var, ttVar, bz7Var2, ta4Var, i);
        }
    }

    public static void F0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iK0 = K0(parcel, i);
        parcel.writeString(str);
        L0(parcel, iK0);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(java.lang.Object r18, defpackage.iqb r19, defpackage.bz7 r20, defpackage.tt r21, java.lang.String r22, defpackage.bz7 r23, defpackage.ta4 r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn5.G(java.lang.Object, iqb, bz7, tt, java.lang.String, bz7, ta4, ld4, int, int):void");
    }

    public static void G0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iK0 = K0(parcel, i);
        parcel.writeStringList(list);
        L0(parcel, iK0);
    }

    public static final void H(iqb iqbVar, tt ttVar, boolean z, ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        int i3;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(380139498);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= e18Var.f(ttVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(ta4Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i6 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                ttVar = lja.G;
            }
            boolean z3 = i5 != 0 ? false : z;
            o5b o5bVarD = dw1.d(ttVar, z3);
            boolean zF = e18Var.f(o5bVarD) | ((i3 & 7168) == 2048);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new ow1(o5bVarD, i6, ta4Var);
                e18Var.k0(objN);
            }
            bvg.a(i3 & 14, 0, e18Var, (pz7) objN, iqbVar);
            z2 = z3;
        } else {
            e18Var.T();
            z2 = z;
        }
        tt ttVar2 = ttVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pw1(iqbVar, ttVar2, z2, ta4Var, i, i2);
        }
    }

    public static void H0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iK0 = K0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        L0(parcel, iK0);
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x056d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(final defpackage.bjh r43, final java.lang.CharSequence r44, final defpackage.pz7 r45, final defpackage.wgh r46, final defpackage.rz7 r47, final defpackage.pz7 r48, final defpackage.pz7 r49, final defpackage.pz7 r50, final defpackage.pz7 r51, final defpackage.pz7 r52, final boolean r53, final boolean r54, final boolean r55, final defpackage.w79 r56, final defpackage.mnc r57, final defpackage.ffh r58, final defpackage.pz7 r59, defpackage.ld4 r60, final int r61, final int r62) {
        /*
            Method dump skipped, instruction units count: 2399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn5.I(bjh, java.lang.CharSequence, pz7, wgh, rz7, pz7, pz7, pz7, pz7, pz7, boolean, boolean, boolean, w79, mnc, ffh, pz7, ld4, int, int):void");
    }

    public static void I0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iK0 = K0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        L0(parcel, iK0);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0648  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(final defpackage.wlg r47, final defpackage.ffh r48, final boolean r49, final boolean r50, final boolean r51, final boolean r52, final defpackage.a6i r53, final defpackage.tkh r54, final defpackage.tkh r55, defpackage.rz7 r56, defpackage.ld4 r57, final int r58) {
        /*
            Method dump skipped, instruction units count: 1688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn5.J(wlg, ffh, boolean, boolean, boolean, boolean, a6i, tkh, tkh, rz7, ld4, int):void");
    }

    public static void J0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static final void K(long j, tkh tkhVar, pz7 pz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(396611577);
        int i2 = (e18Var.e(j) ? 4 : 2) | i | (e18Var.f(tkhVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            zh4.h(j, tkhVar, pz7Var, e18Var, i2 & 1022);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gvd(j, tkhVar, pz7Var, i, 1);
        }
    }

    public static int K0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void L(long j, pz7 pz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(590397809);
        int i2 = (e18Var.e(j) ? 4 : 2) | i | (e18Var.h(pz7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            j8.c(sq6.m(j, on4.a), pz7Var, e18Var, (i2 & 112) | 8);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hgh(j, pz7Var, i);
        }
    }

    public static void L0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final void M(py8 py8Var, iqb iqbVar, ld4 ld4Var, int i) {
        N(yb5.B(py8Var, ld4Var), null, iqbVar, lja.K, ho4.b, 1.0f, null, ld4Var, 56 | (i & 896), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N(defpackage.bpc r18, java.lang.String r19, defpackage.iqb r20, defpackage.tt r21, defpackage.jo4 r22, float r23, defpackage.hr1 r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn5.N(bpc, java.lang.String, iqb, tt, jo4, float, hr1, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O(defpackage.iqb r36, defpackage.x0a r37, final defpackage.mnc r38, final boolean r39, final boolean r40, final defpackage.eo7 r41, final boolean r42, final defpackage.b20 r43, defpackage.qt r44, defpackage.jo0 r45, defpackage.wo1 r46, defpackage.go0 r47, final defpackage.bz7 r48, defpackage.ld4 r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn5.O(iqb, x0a, mnc, boolean, boolean, eo7, boolean, b20, qt, jo0, wo1, go0, bz7, ld4, int, int, int):void");
    }

    public static final void P(int i, ld4 ld4Var) {
        r7e r7eVarS;
        y1c y1cVar;
        Boolean boolValueOf;
        xy7 xy7Var;
        boolean z;
        lz1 lz1Var = jd4.a;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1121540169);
        int i2 = i & 1;
        if (e18Var.Q(i2, i2 != 0)) {
            yy7 yy7VarA = pda.a(e18Var);
            tp4 tp4Var = null;
            if (yy7VarA == null || (xy7Var = (xy7) ((ba4) yy7VarA).K.getValue()) == null) {
                boolValueOf = null;
            } else {
                synchronized (xy7Var.c) {
                    z = xy7Var.f;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (x44.r(boolValueOf, Boolean.TRUE)) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    y1cVar = new y1c(i, 22);
                    r7eVarS.d = y1cVar;
                }
                return;
            }
            iv1.e(0, e18Var);
            e18Var.a0(-1168520582);
            m7f m7fVarB = gr9.b(e18Var);
            e18Var.a0(-1633490746);
            boolean zF = e18Var.f(null) | e18Var.f(m7fVarB);
            Object objN = e18Var.N();
            if (zF || objN == lz1Var) {
                objN = m7fVarB.a(jce.a.b(md9.class), null, null);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            e18Var.p(false);
            md9 md9Var = (md9) objN;
            iei ieiVar = iei.a;
            boolean zH = e18Var.h(md9Var);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new i30(md9Var, tp4Var, 6);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, ieiVar);
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            y1cVar = new y1c(i, 23);
            r7eVarS.d = y1cVar;
        }
    }

    public static a9g Q(int i) {
        return new a9g((i & 1) != 0, z80.G);
    }

    public static final void R(String str, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2128954573);
        int i2 = i | 384;
        if (e18Var.Q(i2 & 1, (i2 & 1169) != 1168)) {
            ta4 ta4VarQ0 = fd9.q0(1952503083, new ix2(ta4Var, 2), e18Var);
            fqb fqbVar = fqb.E;
            mpk.h(str, fqbVar, false, null, ta4VarQ0, e18Var, 24630, 12);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(str, iqbVar2, ta4Var, i, 17);
        }
    }

    public static final iqb S(iqb iqbVar, float f) {
        return f == 1.0f ? iqbVar : j0(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, true, 520187);
    }

    public static float T(float[] fArr) {
        if (fArr.length < 6) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < MTTypesetterKt.kLineSkipLimitMultiplier ? -f7 : f7;
    }

    public static final iqb V(iqb iqbVar, e0g e0gVar) {
        return j0(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e0gVar, true, 518143);
    }

    public static final iqb W(iqb iqbVar) {
        return j0(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, true, 520191);
    }

    public static final iqb Z(iqb iqbVar, String str, boolean z) {
        return z ? tjf.b(iqbVar, false, new j73(str, 11)) : iqbVar;
    }

    public static final iqb a0(iqb iqbVar, e0g e0gVar, tzf tzfVar) {
        return iqbVar.B(new a7g(e0gVar, tzfVar));
    }

    public static Object b0(Class cls) {
        String name;
        String str;
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
        } catch (IllegalAccessException e3) {
            xh6.f(vb7.o(cls, new StringBuilder("Cannot access the constructor ")), e3);
            return null;
        } catch (InstantiationException e4) {
            xh6.f(vb7.o(cls, new StringBuilder("Failed to create an instance of ")), e4);
            return null;
        }
    }

    public static Drawable c0(Context context, int i) {
        return upe.c().e(context, i);
    }

    public static final String d0(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final qt e0(wgh wghVar) {
        if (wghVar instanceof wgh) {
            return wghVar.a;
        }
        xh6.k("Unknown position: ", wghVar);
        return null;
    }

    public static ColorStateList f0(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (k0(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i != 2) {
                return (i < 28 || i > 31) ? u54.c(typedArray.getResources(), typedArray.getResourceId(1, 0), theme) : ColorStateList.valueOf(typedValue.data);
            }
            poc.t("Failed to resolve attribute at index 1: ", typedValue);
        }
        return null;
    }

    public static l94 g0(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        l94 l94VarB;
        if (k0(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new l94((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                l94VarB = l94.b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                l94VarB = null;
            }
            if (l94VarB != null) {
                return l94VarB;
            }
        }
        return new l94((Shader) null, (ColorStateList) null, 0);
    }

    public static SharedPreferences h0(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final iqb i0(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new nr1(bz7Var));
    }

    public static iqb j0(iqb iqbVar, float f, float f2, float f3, float f4, float f5, float f6, e0g e0gVar, boolean z, int i) {
        float f7 = (i & 1) != 0 ? 1.0f : f;
        float f8 = (i & 2) != 0 ? 1.0f : f2;
        float f9 = (i & 4) != 0 ? 1.0f : f3;
        float f10 = (i & 8) != 0 ? 0.0f : f4;
        float f11 = (i & 32) != 0 ? 0.0f : f5;
        float f12 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? 0.0f : f6;
        long j = d5i.b;
        e0g e0gVar2 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? zni.b : e0gVar;
        boolean z2 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? false : z;
        long j2 = na8.a;
        return iqbVar.B(new ka8(f7, f8, f9, f10, f11, f12, j, e0gVar2, z2, j2, j2, (i & 65536) == 0 ? 1 : 0));
    }

    public static boolean k0(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final long l0(long j) {
        if (j < 0) {
            lz1 lz1Var = uh6.F;
            return uh6.H;
        }
        lz1 lz1Var2 = uh6.F;
        return uh6.G;
    }

    public static final float n0(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        long j = ((gwa) e18Var.j(jwa.a)).b.l.b.c;
        long j2 = zai.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((cz5) e18Var.j(ve4.h)).D(j) / 2.0f;
    }

    public static TypedArray o0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final iqb p0(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new dec(bz7Var));
    }

    public static final qnc q0(mnc mncVar, qnc qncVar) {
        mncVar.getClass();
        fu9 fu9Var = fu9.E;
        float fM = gb9.m(qncVar, fu9Var) + gb9.m(mncVar, fu9Var);
        float fL = gb9.l(qncVar, fu9Var) + gb9.l(mncVar, fu9Var);
        return new qnc(fM, qncVar.c + mncVar.d(), fL, qncVar.e + mncVar.a());
    }

    public static final nwb r0(ou7 ou7Var, ld4 ld4Var, int i) {
        xne xneVarB = aoe.b(ld4Var);
        e18 e18Var = (e18) ld4Var;
        boolean zH = e18Var.h(xneVarB) | ((((i & 14) ^ 6) > 4 && e18Var.f(ou7Var)) || (i & 6) == 4);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new zw(xneVarB, ou7Var, null, 15);
            e18Var.k0(objN);
        }
        return mpk.T(null, ou7Var, xneVarB, (pz7) objN, e18Var, ((i << 3) & 112) | 6);
    }

    public static final long s0(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        zh6 zh6Var = zh6.NANOSECONDS;
        if (j4 >= 0) {
            return v40.R(j3, zh6Var);
        }
        zh6 zh6Var2 = zh6.MILLISECONDS;
        if (zh6Var.compareTo(zh6Var2) >= 0) {
            return uh6.q(l0(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        lz1 lz1Var = uh6.F;
        return uh6.m(v40.R(j5, zh6Var2), v40.R(j6, zh6Var));
    }

    public static iqb t0(iqb iqbVar, float f, e0g e0gVar, long j, long j2, int i) {
        boolean z = false;
        if ((i & 4) != 0 && va6.a(f, MTTypesetterKt.kLineSkipLimitMultiplier) > 0) {
            z = true;
        }
        return (va6.a(f, MTTypesetterKt.kLineSkipLimitMultiplier) > 0 || z) ? iqbVar.B(new vzf(f, e0gVar, z, (i & 8) != 0 ? na8.a : j, (i & 16) != 0 ? na8.a : j2)) : iqbVar;
    }

    public static final float u0(ld4 ld4Var) {
        float f = ((va6) ((e18) ld4Var).j(z79.c)).E;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - e) / 2.0f;
        return f2 < MTTypesetterKt.kLineSkipLimitMultiplier ? MTTypesetterKt.kLineSkipLimitMultiplier : f2;
    }

    public static final String v0(tp4 tp4Var) {
        Object hreVar;
        if (tp4Var instanceof z76) {
            return ((z76) tp4Var).toString();
        }
        try {
            hreVar = tp4Var + '@' + d0(tp4Var);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (jre.a(hreVar) != null) {
            hreVar = tp4Var.getClass().getName() + '@' + d0(tp4Var);
        }
        return (String) hreVar;
    }

    public static final po4 w0(wp6 wp6Var, d77 d77Var) {
        return new po4(wp6Var, d77Var, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x0(defpackage.c45 r5, java.lang.Object r6, java.lang.Object r7, defpackage.pz7 r8, defpackage.tp4 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.nh2
            if (r0 == 0) goto L13
            r0 = r9
            nh2 r0 = (defpackage.nh2) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            nh2 r0 = new nh2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.H
            int r1 = r0.I
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.G
            c45 r6 = r0.F
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2b
            r7 = r5
            r5 = r6
            goto L64
        L2b:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L68
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L38:
            defpackage.sf5.h0(r9)
            java.lang.Object r7 = defpackage.qnh.c(r5, r7)
            r0.E = r6     // Catch: java.lang.Throwable -> L54
            r0.F = r5     // Catch: java.lang.Throwable -> L54
            r0.G = r7     // Catch: java.lang.Throwable -> L54
            r0.I = r2     // Catch: java.lang.Throwable -> L54
            sjg r9 = new sjg     // Catch: java.lang.Throwable -> L54
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L54
            if (r8 != 0) goto L56
            java.lang.Object r6 = defpackage.zni.f0(r8, r6, r9)     // Catch: java.lang.Throwable -> L54
        L52:
            r9 = r6
            goto L5f
        L54:
            r6 = move-exception
            goto L68
        L56:
            r0 = 2
            defpackage.nai.n(r0, r8)     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = r8.invoke(r6, r9)     // Catch: java.lang.Throwable -> L54
            goto L52
        L5f:
            m45 r6 = defpackage.m45.E
            if (r9 != r6) goto L64
            return r6
        L64:
            defpackage.qnh.a(r5, r7)
            return r9
        L68:
            defpackage.qnh.a(r5, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn5.x0(c45, java.lang.Object, java.lang.Object, pz7, tp4):java.lang.Object");
    }

    public static void y0(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iK0 = K0(parcel, i);
        parcel.writeBundle(bundle);
        L0(parcel, iK0);
    }

    public static void z0(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iK0 = K0(parcel, i);
        parcel.writeByteArray(bArr);
        L0(parcel, iK0);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte A();

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short B();

    @Override // kotlinx.serialization.encoding.Decoder
    public float C() {
        Y();
        throw null;
    }

    @Override // defpackage.ud4
    public float D(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return C();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double E() {
        Y();
        throw null;
    }

    public abstract void U(tze tzeVar, Object obj);

    public abstract String X();

    public void Y() {
        throw new SerializationException(jce.a.b(getClass()) + " can't retrieve untyped values");
    }

    public void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public ud4 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // defpackage.ud4
    public Decoder e(gfd gfdVar, int i) {
        gfdVar.getClass();
        return y(gfdVar.h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean f() {
        Y();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char h() {
        Y();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        Y();
        throw null;
    }

    @Override // defpackage.ud4
    public long j(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return t();
    }

    @Override // defpackage.ud4
    public char k(gfd gfdVar, int i) {
        gfdVar.getClass();
        return h();
    }

    public Object l(SerialDescriptor serialDescriptor, int i, s06 s06Var, Object obj) {
        serialDescriptor.getClass();
        s06Var.getClass();
        return g(s06Var);
    }

    @Override // defpackage.ud4
    public Object m(SerialDescriptor serialDescriptor, int i, s06 s06Var, Object obj) {
        serialDescriptor.getClass();
        s06Var.getClass();
        if (s06Var.getDescriptor().c() || w()) {
            return g(s06Var);
        }
        return null;
    }

    public void m0(lze lzeVar, Object obj) {
        lzeVar.getClass();
        if (obj == null) {
            return;
        }
        tze tzeVarL0 = lzeVar.L0(X());
        try {
            U(tzeVarL0, obj);
            tzeVarL0.H0();
            csg.o(tzeVarL0, null);
        } finally {
        }
    }

    @Override // defpackage.ud4
    public byte o(gfd gfdVar, int i) {
        gfdVar.getClass();
        return A();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int p();

    @Override // defpackage.ud4
    public short q(gfd gfdVar, int i) {
        gfdVar.getClass();
        return B();
    }

    @Override // defpackage.ud4
    public int r(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return p();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String s() {
        Y();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long t();

    @Override // defpackage.ud4
    public boolean u(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return f();
    }

    @Override // defpackage.ud4
    public String v(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return s();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean w() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder y(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // defpackage.ud4
    public double z(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return E();
    }
}
