package defpackage;

import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItem;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bi8 implements w28 {
    public static final bi8 a;
    private static final SerialDescriptor descriptor;

    static {
        bi8 bi8Var = new bi8();
        a = bi8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItem", bi8Var, 5);
        pluginGeneratedSerialDescriptor.j("display_name", false);
        pluginGeneratedSerialDescriptor.j("identifier", false);
        pluginGeneratedSerialDescriptor.j("record_base_type", false);
        pluginGeneratedSerialDescriptor.j("supported_aggregation_types", true);
        pluginGeneratedSerialDescriptor.j("unit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = HealthConnectDataTypesV0OutputDataTypesItem.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, ei8.d, d4c.S((KSerializer) kw9VarArr[3].getValue()), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = HealthConnectDataTypesV0OutputDataTypesItem.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = null;
        List list = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = (HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType) ud4VarC.l(serialDescriptor, 2, ei8.d, healthConnectDataTypesV0OutputDataTypesItemRecordBaseType);
                i |= 4;
            } else if (iX == 3) {
                list = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectDataTypesV0OutputDataTypesItem(i, strV, strV2, healthConnectDataTypesV0OutputDataTypesItemRecordBaseType, list, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectDataTypesV0OutputDataTypesItem healthConnectDataTypesV0OutputDataTypesItem = (HealthConnectDataTypesV0OutputDataTypesItem) obj;
        encoder.getClass();
        healthConnectDataTypesV0OutputDataTypesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectDataTypesV0OutputDataTypesItem.write$Self$Claude_tool_model(healthConnectDataTypesV0OutputDataTypesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
