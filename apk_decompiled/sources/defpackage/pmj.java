package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.health.platform.client.proto.g;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pmj {
    public static final w6g a = new w6g(0);
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) nij.a(context).F;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.anthropic.claude.R.string.common_google_play_services_enable_button) : resources.getString(com.anthropic.claude.R.string.common_google_play_services_update_button) : resources.getString(com.anthropic.claude.R.string.common_google_play_services_install_button);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i == 1) {
            return resources.getString(com.anthropic.claude.R.string.common_google_play_services_install_text, strA);
        }
        if (i == 2) {
            return nai.P(context) ? resources.getString(com.anthropic.claude.R.string.common_google_play_services_wear_update_text) : resources.getString(com.anthropic.claude.R.string.common_google_play_services_update_text, strA);
        }
        if (i == 3) {
            return resources.getString(com.anthropic.claude.R.string.common_google_play_services_enable_text, strA);
        }
        if (i == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i == 9) {
            return resources.getString(com.anthropic.claude.R.string.common_google_play_services_unsupported_text, strA);
        }
        if (i == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return resources.getString(com.anthropic.claude.R.string.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(com.anthropic.claude.R.string.common_google_play_services_unknown_issue, strA);
        }
    }

    public static String d(Context context, int i) {
        return (i == 6 || i == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i);
    }

    public static String e(Context context, int i) {
        String strH = i == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i);
        return strH == null ? context.getResources().getString(com.anthropic.claude.R.string.common_google_play_services_notification_ticker) : strH;
    }

    public static String f(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.anthropic.claude.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.anthropic.claude.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.anthropic.claude.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case g.AVG_FIELD_NUMBER /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case g.MAX_FIELD_NUMBER /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(com.anthropic.claude.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    public static String h(Context context, String str) {
        Resources resourcesForApplication;
        w6g w6gVar = a;
        synchronized (w6gVar) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(b)) {
                    w6gVar.clear();
                    b = locale;
                }
                String str2 = (String) w6gVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = y88.e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
