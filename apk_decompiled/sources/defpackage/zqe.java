package defpackage;

import com.anthropic.claude.api.errors.ErrorDetails;
import com.anthropic.claude.api.errors.ResponseWithError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zqe implements w28 {
    public static final zqe a;
    private static final SerialDescriptor descriptor;

    static {
        zqe zqeVar = new zqe();
        a = zqeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.errors.ResponseWithError", zqeVar, 5);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("error_code", true);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("resource", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(bs6.b)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ErrorDetails errorDetails = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else if (iX == 2) {
                str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                i |= 4;
            } else if (iX == 3) {
                str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                errorDetails = (ErrorDetails) ud4VarC.m(serialDescriptor, 4, bs6.b, errorDetails);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ResponseWithError(i, str, str2, str3, str4, errorDetails, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ResponseWithError responseWithError = (ResponseWithError) obj;
        encoder.getClass();
        responseWithError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ResponseWithError.write$Self$api(responseWithError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
