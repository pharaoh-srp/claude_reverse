package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0Output;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResult;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class tj8 {
    public static final /* synthetic */ tj8 a = new tj8();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.HealthConnectQueryV0Output", kceVar.b(HealthConnectQueryV0Output.class), new pl9[]{kceVar.b(HealthConnectQueryV0OutputHealthConnectQueryError.class), kceVar.b(HealthConnectQueryV0OutputHealthConnectQueryResult.class)}, new KSerializer[]{uj8.a, yj8.a}, new Annotation[]{new gl0(1)});
    }
}
