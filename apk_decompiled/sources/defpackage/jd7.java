package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.FeatureAccessStatus;
import com.anthropic.claude.api.account.GrowthBookFeature;
import com.anthropic.claude.api.account.GrowthBookRule;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.chat.messages.FlagBlock;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.events.GrowthBookExperimentEventData;
import com.anthropic.claude.api.events.GrowthBookFeatureEvaluationEventData;
import com.anthropic.claude.api.feature.Feature;
import com.anthropic.claude.api.feature.FeatureSettings;
import com.anthropic.claude.tool.custom.ImageSearchOutput;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0Output;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import java.lang.reflect.Method;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd7 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ jd7(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        Class<?> returnType;
        switch (this.E) {
            case 0:
                umg umgVar = kd7.a;
                return null;
            case 1:
                return Feature._init_$_anonymous_();
            case 2:
                return FeatureAccessStatus._init_$_anonymous_();
            case 3:
                return FeatureSettings._childSerializers$_anonymous_();
            case 4:
                return FlagBlock._childSerializers$_anonymous_();
            case 5:
                return new ou7("font:anthropic_sans", sf5.f0(new spe(um6.E, "composeResources/claude.theme.generated.resources/font/anthropic_sans.ttf", -1L, -1L)));
            case 6:
                return new ou7("font:anthropic_sans_italic", sf5.f0(new spe(um6.E, "composeResources/claude.theme.generated.resources/font/anthropic_sans_italic.ttf", -1L, -1L)));
            case 7:
                return new ou7("font:anthropic_serif", sf5.f0(new spe(um6.E, "composeResources/claude.theme.generated.resources/font/anthropic_serif.ttf", -1L, -1L)));
            case 8:
                return new ou7("font:anthropic_serif_italic", sf5.f0(new spe(um6.E, "composeResources/claude.theme.generated.resources/font/anthropic_serif_italic.ttf", -1L, -1L)));
            case 9:
                return new ou7("font:jetbrains_mono", sf5.f0(new spe(um6.E, "composeResources/claude.theme.generated.resources/font/jetbrains_mono.ttf", -1L, -1L)));
            case 10:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 11:
                try {
                    String[] strArr = oy7.F;
                    Method method = (Method) oy7.H.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 12:
                return GrowthBookExperimentEventData._childSerializers$_anonymous_();
            case 13:
                return GrowthBookFeature._childSerializers$_anonymous_();
            case 14:
                return GrowthBookFeatureEvaluationEventData._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return GrowthBookRule._childSerializers$_anonymous_();
            case 16:
                return new bg8();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new zna(50);
            case g.AVG_FIELD_NUMBER /* 18 */:
                wo8 wo8Var = cg8.a;
                long j = d54.h;
                return new og8(j, new qg8(j != 16 ? d54.b(d54.d(j) * 0.7f, j) : j), 20.0f, 0.15f, qg8.d);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return HealthConnectDataTypesV0Output._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return HealthConnectQueryV0Input._childSerializers$_anonymous_();
            case 21:
                return mpk.P(Boolean.FALSE);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ft5 ft5Var = g86.a;
                return tpa.a.J;
            case 24:
                return gqi.a();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ImageSearchOutput._childSerializers$_anonymous_();
            case 26:
                xe4 xe4Var = d19.a;
                return qq5.a;
            case 27:
                return InputMode._init_$_anonymous_();
            case 28:
                return InputSchema._childSerializers$_anonymous_();
            default:
                return InputSchema._childSerializers$_anonymous_$0();
        }
    }
}
