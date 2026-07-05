package defpackage;

import com.anthropic.claude.tool.model.PlacesMapDisplayV0OutputEnrichedPlacesValue;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y3d implements w28 {
    public static final y3d a;
    private static final SerialDescriptor descriptor;

    static {
        y3d y3dVar = new y3d();
        a = y3dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PlacesMapDisplayV0OutputEnrichedPlacesValue", y3dVar, 10);
        pluginGeneratedSerialDescriptor.j("maps_url", true);
        pluginGeneratedSerialDescriptor.j("override_place_id", true);
        pluginGeneratedSerialDescriptor.j("phone_number", true);
        pluginGeneratedSerialDescriptor.j("photos", true);
        pluginGeneratedSerialDescriptor.j("price_level", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("rating_count", true);
        pluginGeneratedSerialDescriptor.j("types", true);
        pluginGeneratedSerialDescriptor.j("website", true);
        pluginGeneratedSerialDescriptor.j("weekday_hours", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = PlacesMapDisplayV0OutputEnrichedPlacesValue.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        KSerializer kSerializerS4 = d4c.S((KSerializer) kw9VarArr[3].getValue());
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, d4c.S(e79Var), d4c.S(na6.a), d4c.S(e79Var), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[9].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = PlacesMapDisplayV0OutputEnrichedPlacesValue.$childSerializers;
        List list = null;
        String str = null;
        boolean z = true;
        List list2 = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list3 = null;
        Integer num = null;
        Double d = null;
        Integer num2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    kw9VarArr = kw9VarArr2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str2);
                    i |= 1;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str3);
                    i |= 2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str4);
                    i |= 4;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    list3 = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 4, e79.a, num);
                    i |= 16;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    d = (Double) ud4VarC.m(serialDescriptor, 5, na6.a, d);
                    i |= 32;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 6, e79.a, num2);
                    i |= 64;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    list2 = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    str = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    list = (List) ud4VarC.m(serialDescriptor, 9, (s06) kw9VarArr2[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            kw9VarArr2 = kw9VarArr;
        }
        ud4VarC.b(serialDescriptor);
        return new PlacesMapDisplayV0OutputEnrichedPlacesValue(i, str2, str3, str4, list3, num, d, num2, list2, str, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PlacesMapDisplayV0OutputEnrichedPlacesValue placesMapDisplayV0OutputEnrichedPlacesValue = (PlacesMapDisplayV0OutputEnrichedPlacesValue) obj;
        encoder.getClass();
        placesMapDisplayV0OutputEnrichedPlacesValue.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PlacesMapDisplayV0OutputEnrichedPlacesValue.write$Self$Claude_tool_model(placesMapDisplayV0OutputEnrichedPlacesValue, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
