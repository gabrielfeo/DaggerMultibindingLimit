import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject638Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject638Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject638(module);
  }

  public static HeavyMultibindingModule_ProvideObject638Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject638Factory(module);
  }

  public static Object provideObject638(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject638());
  }
}
