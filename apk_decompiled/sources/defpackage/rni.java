package defpackage;

import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResult;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResultGeocoded;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rni implements w28 {
    public static final rni a;
    private static final SerialDescriptor descriptor;

    static {
        rni rniVar = new rni();
        a = rniVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("success", rniVar, 4);
        pluginGeneratedSerialDescriptor.j("accuracy", true);
        pluginGeneratedSerialDescriptor.j("geocoded", true);
        pluginGeneratedSerialDescriptor.j("latitude", false);
        pluginGeneratedSerialDescriptor.j("longitude", false);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        na6 na6Var = na6.a;
        return new KSerializer[]{d4c.S(na6Var), d4c.S(tni.a), na6Var, na6Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        Double d = null;
        UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded = null;
        double dZ = 0.0d;
        double dZ2 = 0.0d;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                d = (Double) ud4VarC.m(serialDescriptor, 0, na6.a, d);
                i |= 1;
            } else if (iX == 1) {
                userLocationV0OutputUserLocationResultGeocoded = (UserLocationV0OutputUserLocationResultGeocoded) ud4VarC.m(serialDescriptor, 1, tni.a, userLocationV0OutputUserLocationResultGeocoded);
                i |= 2;
            } else if (iX == 2) {
                dZ = ud4VarC.z(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                dZ2 = ud4VarC.z(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UserLocationV0OutputUserLocationResult(i, d, userLocationV0OutputUserLocationResultGeocoded, dZ, dZ2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult = (UserLocationV0OutputUserLocationResult) obj;
        encoder.getClass();
        userLocationV0OutputUserLocationResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UserLocationV0OutputUserLocationResult.write$Self$Claude_tool_model(userLocationV0OutputUserLocationResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
