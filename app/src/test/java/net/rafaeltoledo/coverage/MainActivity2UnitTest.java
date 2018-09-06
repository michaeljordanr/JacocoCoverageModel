package net.rafaeltoledo.coverage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(RobolectricTestRunner.class)
public class MainActivity2UnitTest {

    @Test
    public void shouldHideButtonAfterClick() {
        MainActivity2 activity = Robolectric.setupActivity(MainActivity2.class);

        Button button = activity.findViewById(R.id.hide);
        TextView text = activity.findViewById(R.id.text);
        button.performClick();

        assertThat(text.getText().toString(), is("Hello World! 2"));
    }
}
