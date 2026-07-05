package defpackage;

import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationError;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationErrorErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nni implements w28 {
    public static final nni a;
    private static final SerialDescriptor descriptor;

    static {
        nni nniVar = new nni();
        a = nniVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("error", nniVar, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qni.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        UserLocationV0OutputUserLocationErrorErrorType userLocationV0OutputUserLocationErrorErrorType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                userLocationV0OutputUserLocationErrorErrorType = (UserLocationV0OutputUserLocationErrorErrorType) ud4VarC.l(serialDescriptor, 0, qni.d, userLocationV0OutputUserLocationErrorErrorType);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UserLocationV0OutputUserLocationError(i, userLocationV0OutputUserLocationErrorErrorType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserLocationV0OutputUserLocationError userLocationV0OutputUserLocationError = (UserLocationV0OutputUserLocationError) obj;
        encoder.getClass();
        userLocationV0OutputUserLocationError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UserLocationV0OutputUserLocationError.write$Self$Claude_tool_model(userLocationV0OutputUserLocationError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
