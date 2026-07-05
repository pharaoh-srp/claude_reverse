package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Power;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ac1 {
    public static ExecutorService a;
    public static final uo1 b = new uo1(-1.0f);
    public static final uo1 c = new uo1(1.0f);
    public static final to1 d = new to1(-1.0f);
    public static final to1 e = new to1(1.0f);
    public static final o54 f = o54.Q;
    public static final float g = 6.0f;
    public static final float h = 6.0f;
    public static final float i = 8.0f;
    public static final float j = 6.0f;

    public static /* synthetic */ void a(int i2) {
        String str = i2 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 18 ? 3 : 2];
        switch (i2) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            default:
                objArr[0] = "name";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[0] = "annotationClass";
                break;
        }
        if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "resolveOverrides";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void b(jwc jwcVar, bz7 bz7Var, ld4 ld4Var, int i2) {
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-557770506);
        int i3 = (e18Var.f(jwcVar) ? 4 : 2) | i2 | (e18Var.h(bz7Var) ? 32 : 16);
        int i4 = 14;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            Context context = (Context) e18Var.j(w00.b);
            String strJ0 = d4c.j0(R.string.trusted_device_reattest_title, e18Var);
            String strJ02 = d4c.j0(R.string.trusted_device_reattest_subtitle, e18Var);
            String strJ03 = d4c.j0(R.string.trusted_device_reattest_negative, e18Var);
            boolean zH = e18Var.h(context) | ((i3 & 14) == 4) | e18Var.f(nwbVarZ) | e18Var.f(strJ0) | e18Var.f(strJ02) | e18Var.f(strJ03);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                ky0 ky0Var = new ky0(jwcVar, context, strJ0, strJ02, strJ03, nwbVarZ, (tp4) null);
                e18Var.k0(ky0Var);
                objN = ky0Var;
            }
            fd9.i(e18Var, (pz7) objN, jwcVar);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(jwcVar, bz7Var, i2, i4);
        }
    }

    public static final void c(List list, bz7 bz7Var, i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        i4g i4gVar2;
        e18 e18Var;
        iqb iqbVar2;
        list.getClass();
        bz7Var.getClass();
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-377588897);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4gVar2 = i4gVar;
            i3 |= e18Var2.f(i4gVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            i4gVar2 = i4gVar;
        }
        int i4 = i3 | 3072;
        if (e18Var2.Q(i4 & 1, (i4 & 1171) != 1170)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(i));
            qnc qncVarB = i4gVar2.b();
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            int i5 = (((i4 & 14) == 4 || ((i4 & 8) != 0 && e18Var2.h(list))) ? 1 : 0) | ((i4 & 112) != 32 ? 0 : 1);
            Object objN = e18Var2.N();
            if (i5 != 0 || objN == jd4.a) {
                objN = new bs4(3, bz7Var, list);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            knk.h(iqbVarC, null, qncVarB, false, ho0Var, null, null, false, null, (bz7) objN, e18Var, 24576, 490);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(list, bz7Var, i4gVar, iqbVar2, i2);
        }
    }

    public static synchronized Executor d() {
        try {
            if (a == null) {
                String str = tpi.a;
                a = Executors.newSingleThreadExecutor(new lpi("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static eri e(sxb sxbVar, qqb qqbVar) {
        if (sxbVar == null) {
            a(19);
            throw null;
        }
        if (qqbVar == null) {
            a(20);
            throw null;
        }
        Collection collectionJ = qqbVar.j();
        if (collectionJ.size() != 1) {
            return null;
        }
        for (eri eriVar : ((tg3) collectionJ.iterator().next()).I()) {
            if (eriVar.getName().equals(sxbVar)) {
                return eriVar;
            }
        }
        return null;
    }

    public static String f(int i2, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(iArr2[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = strArr[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static LinkedHashSet g(sxb sxbVar, Collection collection, Collection collection2, qqb qqbVar, du6 du6Var, gmc gmcVar, boolean z) {
        if (sxbVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (qqbVar == null) {
            a(15);
            throw null;
        }
        if (du6Var == null) {
            a(16);
            throw null;
        }
        if (gmcVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        gmcVar.h(sxbVar, collection, collection2, qqbVar, new l06(du6Var, linkedHashSet, z));
        return linkedHashSet;
    }

    public static LinkedHashSet h(du6 du6Var, qqb qqbVar, sxb sxbVar, gmc gmcVar, AbstractCollection abstractCollection, Collection collection) {
        if (sxbVar == null) {
            a(0);
            throw null;
        }
        if (qqbVar == null) {
            a(3);
            throw null;
        }
        if (du6Var == null) {
            a(4);
            throw null;
        }
        if (gmcVar != null) {
            return g(sxbVar, abstractCollection, collection, qqbVar, du6Var, gmcVar, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet i(du6 du6Var, qqb qqbVar, sxb sxbVar, gmc gmcVar, AbstractCollection abstractCollection, Collection collection) {
        if (sxbVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (qqbVar == null) {
            a(9);
            throw null;
        }
        if (du6Var == null) {
            a(10);
            throw null;
        }
        if (gmcVar != null) {
            return g(sxbVar, collection, abstractCollection, qqbVar, du6Var, gmcVar, true);
        }
        a(11);
        throw null;
    }

    public static void j(int i2, ps9 ps9Var) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            le0.o(ps9Var, i2 != 0 ? le0.m(i2) : null);
            return;
        }
        if (i2 == 0) {
            ps9Var.setXfermode(null);
            return;
        }
        switch (sq6.F(i2)) {
            case 0:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 1:
                mode = PorterDuff.Mode.SRC;
                break;
            case 2:
                mode = PorterDuff.Mode.DST;
                break;
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 6:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 8:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 10:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 11:
                mode = PorterDuff.Mode.XOR;
                break;
            case 12:
                mode = PorterDuff.Mode.ADD;
                break;
            case 13:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 14:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case 16:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = null;
                break;
        }
        ps9Var.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }

    public static final fva k(Mass mass) {
        if (mass.getInGrams() == Double.MIN_VALUE) {
            mass = null;
        }
        if (mass == null) {
            return null;
        }
        xua xuaVar = fva.G;
        return xua.a(mass.getInGrams());
    }

    public static final Energy l(yn6 yn6Var) {
        yn6Var.getClass();
        Energy energyFromCalories = Energy.fromCalories(yn6Var.a());
        energyFromCalories.getClass();
        return energyFromCalories;
    }

    public static final Length m(f3a f3aVar) {
        f3aVar.getClass();
        Length lengthFromMeters = Length.fromMeters(f3aVar.a());
        lengthFromMeters.getClass();
        return lengthFromMeters;
    }

    public static final Mass n(fva fvaVar) {
        fvaVar.getClass();
        Mass massFromGrams = Mass.fromGrams(fvaVar.b());
        massFromGrams.getClass();
        return massFromGrams;
    }

    public static final Power o(jad jadVar) {
        Power powerFromWatts = Power.fromWatts(jadVar.a());
        powerFromWatts.getClass();
        return powerFromWatts;
    }

    public static final yn6 p(Energy energy) {
        sn6 sn6Var = yn6.G;
        return new yn6(energy.getInCalories(), xn6.E);
    }

    public static final f3a q(Length length) {
        y2a y2aVar = f3a.G;
        return y2a.a(length.getInMeters());
    }

    public static final fva r(Mass mass) {
        xua xuaVar = fva.G;
        return xua.a(mass.getInGrams());
    }
}
