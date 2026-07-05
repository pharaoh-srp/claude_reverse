package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.experience.ExperienceAssetScaledImage;
import com.anthropic.claude.api.memory.MelangeMeta;
import com.mikepenz.aboutlibraries.entity.Library;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class g67 implements Comparator {
    public final /* synthetic */ int E;

    public /* synthetic */ g67(int i) {
        this.E = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return ((f67) obj).a.compareTo(((f67) obj2).a);
            case 1:
                return Float.valueOf(((ExperienceAssetScaledImage) obj).getScale()).compareTo(Float.valueOf(((ExperienceAssetScaledImage) obj2).getScale()));
            case 2:
                return nai.r((Float) ((cpc) obj).E, (Float) ((cpc) obj2).E);
            case 3:
                return nai.r(((n18) obj).a, ((n18) obj2).a);
            case 4:
                return Float.valueOf(((bg8) obj).c.h()).compareTo(Float.valueOf(((bg8) obj2).c.h()));
            case 5:
                return nai.r(((ks) obj).b, ((ks) obj2).b);
            case 6:
                return nai.r(((is) obj).b, ((is) obj2).b);
            case 7:
                return nai.r(((is) obj).b, ((is) obj2).b);
            case 8:
                return nai.r(((ks) obj).b, ((ks) obj2).b);
            case 9:
                return nai.r((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 10:
                return nai.r(((Method) obj).getName(), ((Method) obj2).getName());
            case 11:
                return nai.r(((in9) obj).getName(), ((in9) obj2).getName());
            case 12:
                Integer numB = q06.b((ow5) obj, (ow5) obj2);
                if (numB == null) {
                    return 0;
                }
                return numB.intValue();
            case 13:
                return o06.g((qqb) obj).b().compareTo(o06.g((qqb) obj2).b());
            case 14:
                String name = ((Library) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((Library) obj2).getName().toLowerCase(locale);
                lowerCase2.getClass();
                return lowerCase.compareTo(lowerCase2);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Double.valueOf(((u5a) obj).a).compareTo(Double.valueOf(((u5a) obj2).a));
            case 16:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return String.CASE_INSENSITIVE_ORDER.compare(rqk.l((MelangeMeta) obj), rqk.l((MelangeMeta) obj2));
            case g.AVG_FIELD_NUMBER /* 18 */:
                return Integer.valueOf(((usc) obj2).a).compareTo(Integer.valueOf(((usc) obj).a));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return nai.r(((ChatConversation) obj2).getUpdated_at(), ((ChatConversation) obj).getUpdated_at());
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                Date dateA = ((fnd) obj2).a();
                Long lValueOf = dateA != null ? Long.valueOf(dateA.getTime()) : null;
                Date dateA2 = ((fnd) obj).a();
                return nai.r(lValueOf, dateA2 != null ? Long.valueOf(dateA2.getTime()) : null);
            case 21:
                return Integer.valueOf(((jh7) obj2).b()).compareTo(Integer.valueOf(((jh7) obj).b()));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((uo5) obj2).getClass();
                Integer num = 0;
                ((uo5) obj).getClass();
                return num.compareTo(num);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((se5) obj).a.compareTo(((se5) obj2).a);
            case 24:
                return ((v57) obj).a.compareTo(((v57) obj2).a);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((l67) obj).a.compareTo(((l67) obj2).a);
            case 26:
                return ((wl8) obj).a.compareTo(((wl8) obj2).a);
            case 27:
                return ((lad) obj).a.compareTo(((lad) obj2).a);
            case 28:
                return ((q9g) obj).a.compareTo(((q9g) obj2).a);
            default:
                return ((cig) obj).a.compareTo(((cig) obj2).a);
        }
    }
}
