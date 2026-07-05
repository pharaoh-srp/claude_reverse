package defpackage;

import com.mikepenz.aboutlibraries.Libs;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o3a implements w28 {
    public static final o3a a;
    private static final SerialDescriptor descriptor;

    static {
        o3a o3aVar = new o3a();
        a = o3aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.mikepenz.aboutlibraries.Libs", o3aVar, 2);
        pluginGeneratedSerialDescriptor.j("libraries", false);
        pluginGeneratedSerialDescriptor.j("licenses", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = Libs.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = Libs.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        mz8 mz8Var = null;
        rz8 rz8Var = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                mz8Var = (mz8) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), mz8Var);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                rz8Var = (rz8) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), rz8Var);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Libs(i, mz8Var, rz8Var, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Libs libs = (Libs) obj;
        encoder.getClass();
        libs.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Libs.write$Self$aboutlibraries_core_release(libs, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
