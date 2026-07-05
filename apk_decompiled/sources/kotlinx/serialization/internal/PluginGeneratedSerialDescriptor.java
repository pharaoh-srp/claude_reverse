package kotlinx.serialization.internal;

import defpackage.d4c;
import defpackage.f62;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.nm6;
import defpackage.u00;
import defpackage.vsg;
import defpackage.w1a;
import defpackage.w28;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zy7;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, f62 {
    public final String a;
    public final w28 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public ArrayList g;
    public final boolean[] h;
    public Map i;
    public final kw9 j;
    public final kw9 k;
    public final kw9 l;

    public PluginGeneratedSerialDescriptor(String str, w28 w28Var, int i) {
        this.a = str;
        this.b = w28Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.h = new boolean[i4];
        this.i = nm6.E;
        zy7 zy7Var = new zy7(this) { // from class: o7d
            public final /* synthetic */ PluginGeneratedSerialDescriptor F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                int i5 = i2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.F;
                switch (i5) {
                    case 0:
                        w28 w28Var2 = pluginGeneratedSerialDescriptor.b;
                        return (w28Var2 == null || (kSerializerArrChildSerializers = w28Var2.childSerializers()) == null) ? eve.g : kSerializerArrChildSerializers;
                    case 1:
                        w28 w28Var3 = pluginGeneratedSerialDescriptor.b;
                        if (w28Var3 == null || (kSerializerArrTypeParametersSerializers = w28Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return yfd.s(arrayList);
                    default:
                        return Integer.valueOf(d4c.T(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        };
        w1a w1aVar = w1a.F;
        this.j = yb5.w(w1aVar, zy7Var);
        final int i5 = 1;
        this.k = yb5.w(w1aVar, new zy7(this) { // from class: o7d
            public final /* synthetic */ PluginGeneratedSerialDescriptor F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                int i52 = i5;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.F;
                switch (i52) {
                    case 0:
                        w28 w28Var2 = pluginGeneratedSerialDescriptor.b;
                        return (w28Var2 == null || (kSerializerArrChildSerializers = w28Var2.childSerializers()) == null) ? eve.g : kSerializerArrChildSerializers;
                    case 1:
                        w28 w28Var3 = pluginGeneratedSerialDescriptor.b;
                        if (w28Var3 == null || (kSerializerArrTypeParametersSerializers = w28Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return yfd.s(arrayList);
                    default:
                        return Integer.valueOf(d4c.T(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.l = yb5.w(w1aVar, new zy7(this) { // from class: o7d
            public final /* synthetic */ PluginGeneratedSerialDescriptor F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                int i52 = i6;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.F;
                switch (i52) {
                    case 0:
                        w28 w28Var2 = pluginGeneratedSerialDescriptor.b;
                        return (w28Var2 == null || (kSerializerArrChildSerializers = w28Var2.childSerializers()) == null) ? eve.g : kSerializerArrChildSerializers;
                    case 1:
                        w28 w28Var3 = pluginGeneratedSerialDescriptor.b;
                        if (w28Var3 == null || (kSerializerArrTypeParametersSerializers = w28Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return yfd.s(arrayList);
                    default:
                        return Integer.valueOf(d4c.T(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    @Override // defpackage.f62
    public final Set b() {
        return this.i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a()) && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj).k.getValue())) {
                int iE = serialDescriptor.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (x44.r(h(i2).a(), serialDescriptor.h(i2).a()) && x44.r(h(i2).getKind(), serialDescriptor.h(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        List list = this.f[i];
        return list == null ? lm6.E : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        ArrayList arrayList = this.g;
        return arrayList == null ? lm6.E : arrayList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public u00 getKind() {
        return vsg.l;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i) {
        return ((KSerializer[]) this.j.getValue())[i].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.h[i];
    }

    public final void j(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.h[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.i = map;
        }
    }

    public final void k(Annotation annotation) {
        annotation.getClass();
        if (this.g == null) {
            this.g = new ArrayList(1);
        }
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(annotation);
    }

    public String toString() {
        return d4c.p0(this);
    }
}
