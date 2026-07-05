package defpackage;

import com.anthropic.claude.models.organization.configtypes.StudentConfig;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ztg implements w28 {
    public static final ztg a;
    private static final SerialDescriptor descriptor;

    static {
        ztg ztgVar = new ztg();
        a = ztgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.StudentConfig", ztgVar, 3);
        pluginGeneratedSerialDescriptor.j("study", false);
        pluginGeneratedSerialDescriptor.j("career", false);
        pluginGeneratedSerialDescriptor.j("research", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = StudentConfig.$childSerializers;
        return new KSerializer[]{d4c.S((KSerializer) kw9VarArr[0].getValue()), d4c.S((KSerializer) kw9VarArr[1].getValue()), d4c.S((KSerializer) kw9VarArr[2].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = StudentConfig.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                list2 = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                list3 = (List) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list3);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StudentConfig(i, list, list2, list3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StudentConfig studentConfig = (StudentConfig) obj;
        encoder.getClass();
        studentConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StudentConfig.write$Self$models(studentConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
