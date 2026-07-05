package siftscience.android;

import com.sift.api.representations.MobileEventJson;

/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    public static boolean equals(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj == obj2 : obj.equals(obj2);
    }

    public static boolean eventsAreBasicallyEqual(MobileEventJson mobileEventJson, MobileEventJson mobileEventJson2) {
        if ((mobileEventJson == null) ^ (mobileEventJson2 == null)) {
            return false;
        }
        if (mobileEventJson == mobileEventJson2) {
            return true;
        }
        Long l = mobileEventJson.time;
        mobileEventJson.time = mobileEventJson2.time;
        boolean zEquals = mobileEventJson.equals(mobileEventJson2);
        mobileEventJson.time = l;
        return zEquals;
    }
}
