package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class rij {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, fof fofVar) {
        SerialDescriptor serialDescriptorA;
        KSerializer kSerializerB;
        serialDescriptor.getClass();
        fofVar.getClass();
        if (!x44.r(serialDescriptor.getKind(), lnf.l)) {
            return serialDescriptor.isInline() ? a(serialDescriptor.h(0), fofVar) : serialDescriptor;
        }
        pl9 pl9VarX = gb9.x(serialDescriptor);
        SerialDescriptor descriptor = null;
        if (pl9VarX != null && (kSerializerB = fofVar.b(pl9VarX, lm6.E)) != null) {
            descriptor = kSerializerB.getDescriptor();
        }
        return (descriptor == null || (serialDescriptorA = a(descriptor, fofVar)) == null) ? serialDescriptor : serialDescriptorA;
    }

    public static fwi b(qh9 qh9Var) {
        ArrayList arrayList;
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("type");
            int i = 0;
            if (bh9VarS != null && (strM = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length = iArrH.length;
                while (i < length) {
                    int i2 = iArrH[i];
                    if (kgh.d(i2).equals(strM)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("model");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("brand");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("architecture");
            String strM5 = bh9VarS5 != null ? bh9VarS5.m() : null;
            bh9 bh9VarS6 = qh9Var.s("locale");
            String strM6 = bh9VarS6 != null ? bh9VarS6.m() : null;
            bh9 bh9VarS7 = qh9Var.s("locales");
            if (bh9VarS7 != null) {
                ArrayList arrayList2 = bh9VarS7.e().E;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bh9) it.next()).m());
                }
            } else {
                arrayList = null;
            }
            bh9 bh9VarS8 = qh9Var.s("time_zone");
            String strM7 = bh9VarS8 != null ? bh9VarS8.m() : null;
            bh9 bh9VarS9 = qh9Var.s("battery_level");
            Number numberL = bh9VarS9 != null ? bh9VarS9.l() : null;
            bh9 bh9VarS10 = qh9Var.s("power_saving_mode");
            Boolean boolValueOf = bh9VarS10 != null ? Boolean.valueOf(bh9VarS10.a()) : null;
            bh9 bh9VarS11 = qh9Var.s("brightness_level");
            Number numberL2 = bh9VarS11 != null ? bh9VarS11.l() : null;
            bh9 bh9VarS12 = qh9Var.s("logical_cpu_count");
            Number numberL3 = bh9VarS12 != null ? bh9VarS12.l() : null;
            bh9 bh9VarS13 = qh9Var.s("total_ram");
            Number numberL4 = bh9VarS13 != null ? bh9VarS13.l() : null;
            bh9 bh9VarS14 = qh9Var.s("is_low_ram");
            return new fwi(i, strM2, strM3, strM4, strM5, strM6, arrayList, strM7, numberL, boolValueOf, numberL2, numberL3, numberL4, bh9VarS14 != null ? Boolean.valueOf(bh9VarS14.a()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Device", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Device", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Device", e3);
            return null;
        }
    }

    public static final qij c(bg9 bg9Var, SerialDescriptor serialDescriptor) {
        bg9Var.getClass();
        serialDescriptor.getClass();
        u00 kind = serialDescriptor.getKind();
        if (kind instanceof u8d) {
            return qij.J;
        }
        boolean zR = x44.r(kind, vsg.m);
        qij qijVar = qij.H;
        if (zR) {
            return qijVar;
        }
        if (!x44.r(kind, vsg.n)) {
            return qij.G;
        }
        SerialDescriptor serialDescriptorA = a(serialDescriptor.h(0), bg9Var.b);
        u00 kind2 = serialDescriptorA.getKind();
        if ((kind2 instanceof kfd) || x44.r(kind2, mnf.l)) {
            return qij.I;
        }
        if (bg9Var.a.d) {
            return qijVar;
        }
        throw j8.g(serialDescriptorA);
    }
}
